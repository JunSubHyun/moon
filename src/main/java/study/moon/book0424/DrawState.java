package study.moon.book0424;

public class DrawState {

    private MemberStatus memberStatus = MemberStatus.getInstance();

    public void drawChange(){
        MemberStatus.drawState();
        System.out.println("탈퇴 회원 입니다.");
    }

}
