@ECHO OFF
SET BINDIR=%~dp0
CD /D "%BINDIR%"
"C:\Program Files\Java\jre1.8.0_162\bin\java.exe" -Xmx512M -Xms512M -jar BungeeCord.jar
PAUSE