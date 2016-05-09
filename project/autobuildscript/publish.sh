#!/bin/bash

#####
#
# This script will, given a Lift target, try to ensure that the right java environment is set 
# (in a ubuntu system) and then if successful run the module build as specified in respective 
# Lift targets command files.
#
# The command files is set up to clean, compile, test and if the steps compile and tests is successful, 
# that is, correct jvm and java is set up and there are no error in compile or failing tests the    
# sbt build script will proceed with signing and publishing the artifacts.
#
#####

DO_DEBUG=0
LIFT_TARGET="empty"
#sbt command files targeting different Lift versions, see respective files for more information.
PUBLISH_25_SBT_COMMAND_FILE=${PWD}/project/autobuildscript/build-publish-Lift25.txt
PUBLISH_26_SBT_COMMAND_FILE=${PWD}/project/autobuildscript/build-publish-Lift26.txt
PUBLISH_30_SBT_COMMAND_FILE=${PWD}/project/autobuildscript/build-publish-Lift3.txt
#default location's for java on a ubuntu system
JAVA_6_PATH=/usr/lib/jvm/java-6-oracle/jre/bin/java
JAVA_7_PATH=/usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java
JAVA_8_PATH=/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
LOG_FILE=build.log
 
while getopts t: opts; do
  case ${opts} in
  t) LIFT_TARGET=${OPTARG} ;;
  esac
done

#Something went wrong, print some information and exit with error code 1.
function die {
  echo $@
  exit 1
}

#If $DO_DEBUG=0 then echo provided information
function debug {
  if [[ $DO_DEBUG == 0 ]]; then 
    echo -e $@
  else
    echo -n ""
  fi
}

#Validation: Check if provided path is the current set java path.
#This function only works on a ubuntu system.  
function currentJavaPathIsSetTo() {
  local lsalPart=$1
  curr_java_path=$(ls -al /etc/alternatives/java)	
  if [[ $curr_java_path == *${lsalPart}* ]]; then 
    return 0 
  else 
    return 1 
  fi	
}

#This function has the effect of, if needed, trying to set the required java path 
#The function will return 0 if the required java version is or has been successfully set.
function requiredJavaIsSuccessfullySet() {
  local javaPath=$1
  if ! currentJavaPathIsSetTo $javaPath ; then 
    setJDKEnvironment $javaPath		
  fi
  if currentJavaPathIsSetTo $javaPath ; then 
    return 0
  else
    return 1
  fi 	
}

#This function sets the JDK environment in a ubuntu system.
function setJDKEnvironment() {
  local javaPath=$1
  debug "Need to switching JDK version "
  sudo update-alternatives --set java $javaPath 
} 

    
#Execute the necessary steps for publishing a Lift 2.5 module build
function do25Publish {
  debug "\nTarget is set to Lift v2.5, require java-6";
  if ! requiredJavaIsSuccessfullySet $JAVA_6_PATH ; then 
    die "java-6 dosen't seem to be present, cancelling release build!"
  fi
  debug "Current java environment is java-6" 
  debug "\n***Start processing the sbt command file.***\n" 
  sbt < $PUBLISH_25_SBT_COMMAND_FILE 2>&1|tee ${LOG_FILE}
  debug "\n***...done processing the sbt command file***\n"  	
}

#Execute the necessary steps for publishing a Lift 2.6 module build
function do26Publish {
  debug "\nTarget is set to Lift v2.6, require java-6";
  if ! requiredJavaIsSuccessfullySet $JAVA_6_PATH ; then 
    die "java-6 dosen't seem to be present, cancelling release build!"
  fi			
  debug "Current java environment is java-6" 
  debug "\n***Start processing the sbt command file.***\n" 
  sbt < $PUBLISH_26_SBT_COMMAND_FILE 2>&1|tee ${LOG_FILE}
  debug "\n***...done processing the sbt command file***\n"  	
}

#Execute the necessary steps for publishing a Lift 3.0 module build
function do30Publish {
  debug "\nTarget is set to Lift v3.0, require java-8";
  if ! requiredJavaIsSuccessfullySet $JAVA_8_PATH ; then 
    die "java-8 dosen't seem to be present, cancelling release build!"
  fi	  
  debug "Current java environment is java-8\n" 
  debug "\n***Start processing the sbt command file.***\n"  
  sbt < $PUBLISH_30_SBT_COMMAND_FILE 2>&1|tee ${LOG_FILE} 
  debug "\n***...done processing the sbt command file***\n"  	
}

function runMain {
  if [ $LIFT_TARGET == "2.5" ]; then {
    do25Publish
  } elif [ $LIFT_TARGET == "2.6" ]; then { 
    do26Publish 
  } elif [ $LIFT_TARGET == "3.0" ]; then { 
    do30Publish
  } else 
    echo -e "\nNo target set! You need to specify a Lift version as target.\nUsage ./project/autobuildscript/publish.sh -t [2.5,2.6,3.0]\n";
  fi
}

runMain
