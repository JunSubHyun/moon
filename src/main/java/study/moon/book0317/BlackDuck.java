package study.moon.book0317;

public class BlackDuck extends Duck{

    public BlackDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display(){
        System.out.println("흑오리!");
    }

}
