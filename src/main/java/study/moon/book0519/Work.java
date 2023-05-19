package study.moon.book0519;

public class Work implements State{

    private final SignUp signUp;

    public Work(SignUp signUp){
        this.signUp = signUp;
    }

    @Override
    public void approval() {
        //신청했으면 휴가로
        System.out.println("연차 승인완료입니다~~");
        signUp.setState(signUp.vacation);
    }

    @Override
    public void refusal() {
        //거절 당했으면 여전히 일
        System.out.println("그냥 일하세요~");
    }

    @Override
    public void nowStatePrint() {
        System.out.println("일이나 하십쇼!");
        signUp.getWork();
    }
}
