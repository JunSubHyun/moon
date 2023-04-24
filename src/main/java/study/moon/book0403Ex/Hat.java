package study.moon.book0403Ex;

public class Hat extends Accessories {

    public Hat(BillCloset billCloset) {
        super(billCloset);
    }

    @Override
    public String closet() {
        return billCloset.closet()+ hat();
    }

    @Override
    public int price() {
        return billCloset.price();
    }


    public String hat(){
        return " 모자는";
    }


}
