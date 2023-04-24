package study.moon.book0424;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberStatusTest {

    private MemberStatus memberStatus= MemberStatus.getInstance();

    @Test
    void test(){
        System.out.println(memberStatus.MemberState());

        new HumanState().humanChange();
        System.out.println(memberStatus.MemberState());

        new DrawState().drawChange();
        System.out.println(memberStatus.MemberState());

        new UseState().useChange();
        System.out.println(memberStatus.MemberState());

    }

}