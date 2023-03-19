package study.moon.book0317;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("소리를 낼수 없다!");
    }
}
