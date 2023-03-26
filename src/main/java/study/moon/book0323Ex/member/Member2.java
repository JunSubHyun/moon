package study.moon.book0323Ex.member;

public class Member2 implements Member{
    @Override
    public void pushMsg(String msg) {
        System.out.println("Member2 Push :" + msg);
    }
}
