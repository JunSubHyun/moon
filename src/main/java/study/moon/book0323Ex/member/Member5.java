package study.moon.book0323Ex.member;

public class Member5 implements Member{
    @Override
    public void pushMsg(String msg) {
        System.out.println("Member5 Push :" + msg);
    }
}
