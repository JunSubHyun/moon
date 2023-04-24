package study.moon.book0403Ex;

public class AdidasShoes extends Shoes{

    public AdidasShoes(BillCloset billCloset) {
        super(billCloset);
    }

    @Override
    public String closet() {
        return billCloset.closet() + shoes()+ adidasShoes();
    }

    @Override
    public int price() {
        return billCloset.price()+ adidasShoesPrice();
    }


    public String adidasShoes(){
        return " 아디다스";
    }

    public int adidasShoesPrice(){
        return 30000;
    }


}
