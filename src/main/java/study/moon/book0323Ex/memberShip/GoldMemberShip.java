package study.moon.book0323Ex.memberShip;

import study.moon.book0323Ex.member.Member;

import java.util.ArrayList;
import java.util.List;

public class GoldMemberShip implements MemberShip {

    private List<Member> members = new ArrayList<>();

    public void eventPush(){
        pushMsgMember("이벤트 시작합니다.");
    }

    public void sorryErrorPush(){
        pushMsgMember("오류가 발생해서 사과드립니다.");
    }

    @Override
    public void addMember(Member member) {
        System.out.println("골드 맴버가 되신걸 환영합니다.");
        members.add(member);
    }

    @Override
    public void delMember(Member member) {
        System.out.println("골드 맴버가 취소되었습니다.");
        members.remove(member);
    }

    @Override
    public void pushMsgMember(String msg) {
        members.forEach(member -> member.pushMsg(msg));
    }
}
