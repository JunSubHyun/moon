package study.moon.book0424;

public class UseState {

    private MemberStatus memberStatus = MemberStatus.getInstance();

    public void useChange(){
        MemberStatus.useState();
        System.out.println("사용 회원 입니다.");
    }

}
