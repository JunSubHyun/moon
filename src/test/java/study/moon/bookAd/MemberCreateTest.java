package study.moon.bookAd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberCreateTest {

    @Test
    void test(){

        MemberEntity member = new MemberEntity();
        String cell = "010-1234-1234";


        MemberCreate join = new JoinMember("현준섭",cell);
        MemberCreate certified = new CertifiedAdapter(new Certified(),cell);

        join.insertMember(member);
        certified.insertMember(member);


    }


}