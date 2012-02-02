java -XX:MaxPermSize=512m -Xmx712M -Xss2M -XX:+CMSClassUnloadingEnabled -jar `dirname $0`/sbt-launch.jar "$@"
