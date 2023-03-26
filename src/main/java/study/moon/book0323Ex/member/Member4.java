package study.moon.book0323Ex.member;

public class Member4 implements Member{
    @Override
    public void pushMsg(String msg) {
        System.out.println("Member4 Push :" + msg);
    }
}
