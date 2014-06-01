
Usage
===== 

To publish use the publish.sh script

./project/autobuildscript/publish.sh -t [2.5,2.6,3.0]

The build script will make sure the correkt JDK is set and execute one of the folloiwng 
sbt command files depending on chosen input (target) parameter.

Target Lift 2.5 (java6, Scala 2.9.1, 2.9.1-1, 2.9.2, 2.10)
sbt < project/autobuildscript/build-publish-releas.txt > build.log | tail -f build.log

Current target Lift 2.6 (java6 Scala 2.9.1, 2.9.1-1, 2.9.2, 2.10)
sbt < project/autobuildscript/build-publish-SNAPSHOT.txt > build.log | tail -f build.log

Target Lift 3.x (OBS! use java7 Scala 2.10)
sbt < project/autobuildscript/build-publish-Lift3-SNAPSHOT.txt > build.log | tail -f build.log
