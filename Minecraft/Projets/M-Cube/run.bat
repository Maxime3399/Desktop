@ECHO OFF
SET BINDIR=%~dp0
CD /D "%BINDIR%"
"C:\Program Files\Java\jre1.8.0_181\bin\java.exe" -Xmx1024M -Xms1024M -jar spigot-1.13.jar
PAUSE