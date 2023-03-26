package study.moon.book0323Ex.member;

import lombok.Getter;

@Getter
public class GoldMemberDTO implements Member{

    private String name;

    private String grade;

    public GoldMemberDTO(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public void pushMsg(String msg) {
        System.out.println("Gold Member Push "+name +" :" + msg);
    }
}
