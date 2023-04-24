package study.moon.book0424;

public class HumanState {

    private MemberStatus memberStatus = MemberStatus.getInstance();

    public void humanChange(){
        MemberStatus.humanState();
        System.out.println("휴먼 회원 입니다.");
    }

}
