package study.moon.bookAd;

public class JoinMember implements MemberCreate{

    private String name;

    private String cell;

    public JoinMember(String name, String cell) {
        this.name = name;
        this.cell = cell;
    }

    @Override
    public void insertMember(MemberEntity member) {
        member.setName(name);
        member.setCell(cell);
        System.out.println("성함 : " + member.getName());
        System.out.println("번호 : " + member.getCell());
    }
}
