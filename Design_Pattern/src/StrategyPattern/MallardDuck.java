package StrategyPattern;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyingBehaviour = new FlyWithWings();
    }
    public static void main(String[] args) {
        Duck md = new MallardDuck();
        md.performFly();
        md.display();
        md.performQuack();

        Duck pd = new plasticDuck();
        pd.performQuack();
        pd.performFly();
        pd.display();

    }
}

class plasticDuck extends Duck{
    plasticDuck(){
        quackBehaviour = new Squeak();
        flyingBehaviour = new FlyNoWay();
    }


}
