package study.moon.book0403Ex;

public class NikeHat extends Hat{

    public NikeHat(BillCloset billCloset) {
        super(billCloset);
    }

    @Override
    public String closet() {
        return billCloset.closet() + hat()+ nikeHat();
    }

    @Override
    public int price() {
        return billCloset.price()+ nikeHatPrice();
    }


    public String nikeHat(){
        return " Nike";
    }

    public int nikeHatPrice(){
        return 25000;
    }


}
