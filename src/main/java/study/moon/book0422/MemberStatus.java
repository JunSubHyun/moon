package study.moon.book0422;

public class MemberStatus {

    private static MemberStatus memberStatus = new MemberStatus();

    private MemberStatus(){}

    public static MemberStatus getInstance(){
        return memberStatus;
    }

    private static State state = State.use;

    public static void humanState(){
        state = State.human;

    }

    public static void drawState(){
        state = State.draw;
    }

    public static void useState(){
        state = State.use;
    }

    public String MemberState(){
        return " 회원의 상태는  :" + state;
    }

}
