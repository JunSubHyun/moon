package study.moon.book0317;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("고무 오리 소리 꽥꽥!");
    }
}
