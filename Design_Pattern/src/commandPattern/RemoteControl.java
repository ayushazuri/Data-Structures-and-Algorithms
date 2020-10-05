package commandPattern;

public class RemoteControl {
    Command commandOn[];
    Command commandOff[];

    RemoteControl(){
        commandOn = new Command[4];
        commandOff = new Command[4];

        Command noCommand = new NoCommand();
        for(int i=0;i<4;i++){
            commandOn[i] = noCommand;
            commandOff[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        commandOn[slot] = onCommand;
        commandOff[slot] = offCommand;
    }

    public void onButton(int slot){
        commandOn[slot].execute();
    }

    public void offButton(int slot){
        commandOff[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < commandOn.length; i++) {
            stringBuff.append("[slot " + i + "] " + commandOn[i].getClass().getName()
                    + "    " + commandOff[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
