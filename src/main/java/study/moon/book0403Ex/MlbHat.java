package study.moon.book0403Ex;

public class MlbHat extends Hat{

    public MlbHat(BillCloset billCloset) {
        super(billCloset);
    }

    @Override
    public String closet() {
        return billCloset.closet() + hat()+ mlbHat();
    }

    @Override
    public int price() {
        return billCloset.price()+ mlbHatPrice();
    }


    public String mlbHat(){
        return " MLB";
    }

    public int mlbHatPrice(){
        return 15000;
    }


}
