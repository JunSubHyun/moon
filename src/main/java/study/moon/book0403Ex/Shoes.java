package study.moon.book0403Ex;

public class Shoes extends Accessories{

    public Shoes(BillCloset billCloset) {
        super(billCloset);
    }

    @Override
    public String closet() {
        return billCloset.closet()+ shoes();
    }

    @Override
    public int price() {
        return billCloset.price();
    }


    public String shoes(){
        return " 신발은";
    }



}
