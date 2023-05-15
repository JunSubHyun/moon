package study.moon.bookAd;

public class CertifiedAdapter implements MemberCreate{

    private Certified certified;

    private String cell;

    public CertifiedAdapter(Certified certified,String cell){
        this.certified = certified;
        this.cell = cell;
    }

    @Override
    public void insertMember(MemberEntity member) {
        member.setCi(certified.findCi(cell));
        System.out.println("ci : "+ member.getCi());
    }
}
