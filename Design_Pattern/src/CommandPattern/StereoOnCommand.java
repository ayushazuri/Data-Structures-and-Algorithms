package CommandPattern;

public class StereoOnCommand implements Command{
    Stereo stereo;
    StereoOnCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);

    }
}
