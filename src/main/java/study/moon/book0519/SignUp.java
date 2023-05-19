package study.moon.book0519;

public class SignUp {

    final State vacation;
    final State work;

    private State nowState;

    public SignUp() {
        vacation = new Vacation(this);
        work = new Work(this);
        this.nowState = this.work;
    }

    public void approval(){
         nowState.approval();
    }

    public void setState(State state){
        this.nowState = state;
    }

    public void getVacation(){
        this.nowState.approval();
    }

    public void getWork(){
        this.nowState.refusal();
    }

    public State getNowState() {
        return nowState;
    }
}
