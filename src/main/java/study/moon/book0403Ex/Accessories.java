package study.moon.book0403Ex;

public abstract class Accessories implements BillCloset {

    BillCloset billCloset;

    public Accessories(BillCloset billCloset) {
        this.billCloset = billCloset;
    }

    @Override
    public String closet() {
        return billCloset.closet();
    }

    @Override
    public int price() {
        return billCloset.price();
    }
}
