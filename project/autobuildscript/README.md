
Usage  
===== 

Lift 2.6.x is built with java 6 and lift 3.x is built with java 8

More memory to sbt http://stackoverflow.com/questions/15280839/how-to-set-heap-size-for-sbt

To publish use the publish.sh script, to change to a local publish replace 'publish' with 'publish-local' or 
'publishlocal' in respective publish script.

As of FoBo v1.4 builds against Lift 2.5 is no longer supported.
As of FoBo v2.0 builds against Lift 2.6 is no longer supported. 

./project/autobuildscript/publish.sh -t [2.5,2.6,3.0,3.1,3.2,3.3]

The build script will make sure the correct JDK is set and execute one of the following 
sbt command files depending on chosen input (target) parameter.

Target Lift 2.5 (java6, Scala 2.9.1, 2.9.1-1, 2.9.2, 2.10)
sbt < project/autobuildscript/build-publish-Lift25.txt > build.log | tail -f build.log

Current target Lift 2.6 (java6 Scala 2.9.1, 2.9.1-1, 2.9.2, 2.10, 2.11)
sbt < project/autobuildscript/build-publish-Lift26.txt > build.log | tail -f build.log

Target Lift 3.0 (OBS! use java8 Scala 2.11)
sbt < project/autobuildscript/build-publish-Lift30.txt > build.log | tail -f build.log

Target Lift 3.1 (java8 Scala 2.11, 2.12)
sbt < project/autobuildscript/build-publish-Lift31.txt > build.log | tail -f build.log

Target Lift 3.2 (java8 Scala 2.11, 2.12)
sbt < project/autobuildscript/build-publish-Lift32.txt > build.log | tail -f build.log

List of major Java major version numbers
Java SE 8 = 52,
Java SE 7 = 51,
Java SE 6.0 = 50,
Java SE 5.0 = 49,
JDK 1.4 = 48,
JDK 1.3 = 47,
JDK 1.2 = 46,
JDK 1.1 = 45


Read more: http://javarevisited.blogspot.com/2015/05/fixing-unsupported-majorminor-version.html#ixzz3sp1dOCEf

