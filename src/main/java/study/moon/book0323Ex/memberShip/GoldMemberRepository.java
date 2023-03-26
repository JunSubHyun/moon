package study.moon.book0323Ex.memberShip;

import study.moon.book0323Ex.member.GoldMemberDTO;

import java.util.ArrayList;
import java.util.List;

public class GoldMemberRepository {

    public List<GoldMemberDTO> goldMemberList(){
        GoldMemberDTO goldMember1 = new GoldMemberDTO("골드회원1" , "gold");
        GoldMemberDTO goldMember2 = new GoldMemberDTO("골드회원2" , "gold");

        List<GoldMemberDTO> goldMembers = new ArrayList<>();
        goldMembers.add(goldMember1);
        goldMembers.add(goldMember2);

        return goldMembers;
    }

}
