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

while getopts t: opts; do
   case ${opts} in
    t) LIFT_TARGET=${OPTARG} ;;
   esac
done

if [ $LIFT_TARGET == "2.5" ]; then {
	echo "Target is set to Lift v2.5";
	echo -e "Update java: setting java-7-openjdk-amd64 "
	sudo update-alternatives --set java /usr/lib/jvm/java-6-openjdk-amd64/jre/bin/java
	echo -e "\n***Start processing the sbt command file.***\n" 
	sbt < ./project/autobuildscript/build-publish-release.txt > build.log
	echo -e "\n***...done processing the sbt command file***\n"  	
} elif [ $LIFT_TARGET == "2.6" ]; then {
	echo "Target is set to Lift v2.6";
	echo -e "Update java: setting java-6-openjdk-amd64 "
	sudo update-alternatives --set java /usr/lib/jvm/java-6-openjdk-amd64/jre/bin/java
	echo -e "\n***Start processing the sbt command file.***\n" 
	sbt < ./project/autobuildscript/build-publish-SNAPSHOT.txt > build.log
	echo -e "\n***...done processing the sbt command file***\n"  
} elif [ $LIFT_TARGET == "3.0" ]; then { 
	echo -e "\nTarget is set to Lift v3.0\n";
	echo -e "Update java: setting java-7-openjdk-amd64 "
	sudo update-alternatives --set java /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java 
	echo -e "\n***Start processing the sbt command file.***\n"  
	sbt < ./project/autobuildscript/build-publish-Lift3-SNAPSHOT.txt >> build.log 
	echo -e "\n$?"
	echo -e "\n***...done processing the sbt command file***\n"  
} else 
	echo "No target set! You need to specify a Lift version as target. Usage xxxxx -t [2.5,2.6,3.0]";
fi