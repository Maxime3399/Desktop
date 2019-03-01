@ECHO OFF
SET BINDIR=%~dp0
CD /D "%BINDIR%"
"D:\Program Files\Java\bin\java.exe" -Xmx1024M -Xms1024M -jar spigot-1.13.2.jar
PAUSE