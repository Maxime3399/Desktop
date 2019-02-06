@ECHO OFF
SET BINDIR=%~dp0
CD /D "%BINDIR%"
"C:\Program Files\Java\jre1.8.0_201\bin\java.exe" -Xmx1024M -Xms1024M -jar spigot-1.13.2.jar
PAUSE