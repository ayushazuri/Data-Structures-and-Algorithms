package commandPattern;

public class GarageDoorOnCommand implements Command{
    GarageDoor garageDoor;
    GarageDoorOnCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
