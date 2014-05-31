#!/bin/bash

#####
#
# This script will, given a Lift target, ensure that the right jdk is set (in a ubuntu system) 
# and the run the module build as specified in respective Lift targets command files.
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
	echo "Target is set to 2.5";
	sudo update-alternatives --set java /usr/lib/jvm/java-6-openjdk-amd64/jre/bin/java
	sbt < ./project/autobuildscript/build-publish-release.txt > build.log	
} elif [ $LIFT_TARGET == "2.6" ]; then 
	echo "Target is set to 2.6";
	sudo update-alternatives --set java /usr/lib/jvm/java-6-openjdk-amd64/jre/bin/java
	sbt < ./project/autobuildscript/build-publish-SNAPSHOT.txt > build.log
elif [ $LIFT_TARGET == "3.0" ]; then 
	echo "Target is set to 3.0";
	sudo update-alternatives --set java /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java 
	sbt < ./project/autobuildscript/build-publish-Lift3-SNAPSHOT.txt > build.log 
else 
	echo "No target set! You need to specify a Lift version as target. Usage xxxxx -t [2.5,2.6,3.0]";
fi