package commandPattern;

public class GarageDoorOffCommand implements Command{
    GarageDoor garageDoor;

    GarageDoorOffCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOff();
    }
}
