package study.moon.book0403Ex;

public class NikeShoes extends Shoes{

    public NikeShoes(BillCloset billCloset) {
        super(billCloset);
    }

    @Override
    public String closet() {
        return billCloset.closet() + shoes()+ nikeShoes();
    }

    @Override
    public int price() {
        return billCloset.price()+ nikeShoesPrice();
    }


    public String nikeShoes(){
        return " 나이키";
    }

    public int nikeShoesPrice(){
        return 40000;
    }
}
