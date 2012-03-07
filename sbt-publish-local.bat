set SCRIPT_DIR=%~dp0
java -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx712M -Xss2M -jar "%SCRIPT_DIR%\project\sbt-launch.jar" clean update less compile package publish-local
