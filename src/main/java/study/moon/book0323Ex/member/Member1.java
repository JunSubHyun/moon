package study.moon.book0323Ex.member;

public class Member1 implements Member{

    @Override
    public void pushMsg(String msg) {
        System.out.println("Member1 Push :" + msg);
    }
}
