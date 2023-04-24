package study.moon.book0403Ex;

public class JumpSuit implements BillCloset{
    @Override
    public String closet() {
        return "점프슈트~";
    }

    @Override
    public int price() {
        return 40000;
    }
}
