package CommandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        GarageDoorOnCommand garageDoorOn = new GarageDoorOnCommand(garageDoor);
        GarageDoorOffCommand garageDoorOff = new GarageDoorOffCommand(garageDoor);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(2, garageDoorOn, garageDoorOff);

        System.out.println(remoteControl);

        remoteControl.onButton(0);
        remoteControl.offButton(0);
        remoteControl.onButton(1);
        remoteControl.offButton(1);
        remoteControl.onButton(2);
        remoteControl.offButton(2);

    }
}
