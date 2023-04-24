package study.moon.book0403Ex;

public class OnePiece implements BillCloset{

    @Override
    public String closet() {
        return "원피스~";
    }

    @Override
    public int price() {
        return 50000;
    }
}
