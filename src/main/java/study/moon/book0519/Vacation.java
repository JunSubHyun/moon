package study.moon.book0519;

public class Vacation implements State {

    private final SignUp signUp;

    public Vacation(SignUp signUp) {

        this.signUp = signUp;
    }


    @Override
    public void approval() {
        //신청했으면 휴가로
        System.out.println("연차중~~");
    }

    @Override
    public void refusal() {
        //거절 당했으면 여전히 일
        System.out.println("일하세요~");
        signUp.setState(signUp.work);
    }

    @Override
    public void nowStatePrint() {
        System.out.println("떠나요~!");
        signUp.getVacation();
    }
}
