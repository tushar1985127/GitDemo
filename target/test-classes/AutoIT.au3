$windowhandle=WinGetHandle("File Upload")
WinActivate($windowhandle)

ControlSetText("File Upload","","[CLASS:Edit;INSTANCE:1]",$CmdLine[1])
ControlClick("File Upload","","[CLASS:Button;INSTANCE:1]")