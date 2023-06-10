@echo off
setlocal EnableDelayedExpansion
for /f "delims=" %%a in ('powershell -Command "(Invoke-WebRequest ifconfig.me/ip).Content.Trim()"') do set ip=%%a

set vbs=ip.vbs
echo Set objShell = CreateObject("Wscript.Shell") >%vbs%
echo message = "%ip%" >>%vbs%
echo MsgBox message,0+64,"Hi." >>%vbs%

start %vbs%

timeout /t 1

del %vbs%
