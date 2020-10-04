package StrategyPattern;

public class FlyWithWings implements FlyingBehaviour {

    @Override
    public void fly() {
        System.out.println("I can Fly.");
    }
}
