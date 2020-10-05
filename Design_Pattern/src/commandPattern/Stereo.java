package commandPattern;

public class Stereo {

    public Stereo() {

    }

    public void on() {
        System.out.println(" stereo is on");
    }

    public void off() {
        System.out.println(" stereo is off");
    }

    public void setCD() {
        System.out.println(" stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(" stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println( " stereo is set for Radio");
    }

    public void setVolume(int volume) {

        System.out.println(" Stereo volume set to " + volume);
    }
}
