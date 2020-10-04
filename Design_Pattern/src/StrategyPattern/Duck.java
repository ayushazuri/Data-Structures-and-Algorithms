package StrategyPattern;

public class Duck {
    QuackBehaviour quackBehaviour;
    FlyingBehaviour flyingBehaviour;

    void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    void setFlyingBehaviour(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }
    void performQuack(){
        quackBehaviour.quack();
    }

    void performFly(){
        flyingBehaviour.fly();
    }

    void swim(){
        System.out.println("Duck is swimming");
    }
    void eat(){
        System.out.println("Duck is eating");
    }
    void display(){
        System.out.println("Duck is displayed");
    }

}
