package study.moon.book0519;

public interface State {
    //신청
    void approval();
    //반려
    void refusal();
    
    //현상태
    void nowStatePrint();
}
