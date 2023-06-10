msg * "I KNOW YOUR IP"
msg * (Invoke-WebRequest ifconfig.me/ip).Content.Trim()
