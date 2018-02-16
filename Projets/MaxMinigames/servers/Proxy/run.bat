@ECHO OFF
SET BINDIR=%~dp0
CD /D "%BINDIR%"
"C:\Program Files (x86)\Java\jre1.8.0_151\bin\java.exe" -Xmx512M -Xms512M -jar BungeeCord.jar
PAUSE