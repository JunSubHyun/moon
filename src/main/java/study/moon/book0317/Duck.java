package study.moon.book0317;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void performQuck(){
        flyBehavior.fly();
        quackBehavior.quack();
    }

}
