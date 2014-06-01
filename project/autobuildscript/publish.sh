#!/bin/bash

#####
#
# This script will, given a Lift target, ensure that the right jdk is set (in a ubuntu system) 
# and then run the module build as specified in respective Lift targets command files.
# The command files is set up to clean, compile, test and if compile and tests are successful, 
# that is, correct jvm and java is set up and there are no error in compile or failing tests the    
# build will proceed with signing and publishing the artifacts.
#
#####

#echo "$# parameters"; echo "$@";
LIFT_TARGET="empty"
PUBLISH_25_SBT_COMMAND_FILE=${PWD}/project/autobuildscript/build-publish-release.txt
PUBLISH_26_SBT_COMMAND_FILE=${PWD}/project/autobuildscript/build-publish-SNAPSHOT.txt
PUBLISH_30_SBT_COMMAND_FILE=${PWD}/project/autobuildscript/build-publish-Lift3-SNAPSHOT.txt
JDK_6_PATH=/usr/lib/jvm/java-6-openjdk-amd64/jre/bin/java
JDK_7_PATH=/usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java
LOG_FILE=build.log

while getopts t: opts; do
   case ${opts} in
    t) LIFT_TARGET=${OPTARG} ;;
   esac
done

function die {
    echo $@
    exit 1
}

function do25Publish {
	echo -e "\nTarget is set to Lift v2.5";
	curr_java_path=$(ls -al /etc/alternatives/java)	
	if [[ ! $curr_java_path == *java-6* ]]; then
		echo -e "Setting JDK: java-6-openjdk-amd64 "  	
	 	sudo update-alternatives --set java $JDK_6_PATH
	fi
	curr_java_path=$(ls -al /etc/alternatives/java)	
	if [[ ! $curr_java_path == *java-6* ]]; then  
		die "java-6 dosen't seem to be present, cancelling release build!"	
    fi 
    echo "Current java environment is java-6" 
	echo -e "\n***Start processing the sbt command file.***\n" 
	sbt < $PUBLISH_25_SBT_COMMAND_FILE 2>&1|tee ${LOG_FILE}
	echo -e "\n***...done processing the sbt command file***\n"  	
}

function do26Publish {
	echo -e "\nTarget is set to Lift v2.6";
	curr_java_path=$(ls -al /etc/alternatives/java)	
	if [[ ! $curr_java_path == *java-6* ]]; then	
	 	echo -e "Setting JDK: java-6-openjdk-amd64 "
	 	sudo update-alternatives --set java $JDK_6_PATH
    fi
	curr_java_path=$(ls -al /etc/alternatives/java)	
	if [[ ! $curr_java_path == *java-6* ]]; then  
		die "java-6 dosen't seem to be present, cancelling release build!"	
    fi 		
    echo "Current java environment is java-6" 
	echo -e "\n***Start processing the sbt command file.***\n" 
	sbt < $PUBLISH_26_SBT_COMMAND_FILE 2>&1|tee ${LOG_FILE}
	echo -e "\n***...done processing the sbt command file***\n"  	
}

function do30Publish {
	echo -e "\nTarget is set to Lift v3.0";
	curr_java_path=$(ls -al /etc/alternatives/java)	
	if [[ ! $curr_java_path == *java-7* ]]; then 
		echo -e "Setting JDK: java-7-openjdk-amd64 "
	 	sudo update-alternatives --set java $JDK_7_PATH 
    fi     
	curr_java_path=$(ls -al /etc/alternatives/java)	
	if [[ ! $curr_java_path == *java-7* ]]; then  
		die "java-7 dosen't seem to be present, cancelling release build!"	
    fi    
    echo "Current java environment is java-7" 
	echo -e "\n***Start processing the sbt command file.***\n"  
    sbt < $PUBLISH_30_SBT_COMMAND_FILE 2>&1|tee ${LOG_FILE} 
	echo -e "\n***...done processing the sbt command file***\n"  	
}

if [ $LIFT_TARGET == "2.5" ]; then {
	do25Publish
} elif [ $LIFT_TARGET == "2.6" ]; then {
    do26Publish 
} elif [ $LIFT_TARGET == "3.0" ]; then { 
    do30Publish
} else 
	echo -e "\a No target set! You need to specify a Lift version as target. Usage ./project/autobuildscript/publish.sh -t [2.5,2.6,3.0]";
fi
