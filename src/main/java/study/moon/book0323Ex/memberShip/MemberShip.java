package study.moon.book0323Ex.memberShip;

import study.moon.book0323Ex.member.Member;

public interface MemberShip {
    //맴버쉽

    //맴버 추가
    void addMember(Member member);

    //맴버 취소
    void delMember(Member member);

    //맴버에게 푸쉬알림
    void pushMsgMember(String msg);

}
