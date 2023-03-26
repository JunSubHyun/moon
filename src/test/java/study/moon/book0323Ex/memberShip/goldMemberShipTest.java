package study.moon.book0323Ex.memberShip;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.moon.book0323Ex.member.GoldMemberDTO;
import study.moon.book0323Ex.member.Member1;
import study.moon.book0323Ex.member.Member2;
import study.moon.book0323Ex.member.Member3;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class goldMemberShipTest {

    @Test
    void test(){
        GoldMemberShip goldMemberShip = new GoldMemberShip();

        Member1 member1 = new Member1();
        Member2 member2 = new Member2();
        Member3 member3 = new Member3();

        goldMemberShip.addMember(member1);
        goldMemberShip.addMember(member2);
        goldMemberShip.addMember(member3);

        goldMemberShip.pushMsgMember("골드~");
        goldMemberShip.delMember(member2);

        goldMemberShip.eventPush();

    }

    @Test
    void test2(){
        GoldMemberShip goldMemberShip = new GoldMemberShip();

        GoldMemberDTO goldMember1 = new GoldMemberDTO("골드회원1" , "gold");
        GoldMemberDTO goldMember2 = new GoldMemberDTO("골드회원2" , "gold");

        List<GoldMemberDTO> goldMembers = new ArrayList<>();
        goldMembers.add(goldMember1);
        goldMembers.add(goldMember2);

        goldMembers.forEach(goldMemberDTO -> goldMemberShip.addMember(goldMemberDTO));

        goldMemberShip.sorryErrorPush();
    }

}