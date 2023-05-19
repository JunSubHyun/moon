package study.moon.book0519;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StateTest {

    @Test
    void test(){

        SignUp signUp = new SignUp();

        //일중
        signUp.getWork();
        
        //연차신청 통과
        signUp.getVacation();

        //변심하여 반려
        signUp.getWork();

        //재신청
        signUp.getVacation();

        





    }

}