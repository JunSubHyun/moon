package study.moon.book0403Ex;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BillClosetTest {

    @Test
    void test1(){
        BillCloset billCloset = new OnePiece();

        billCloset = new NikeHat(billCloset);
        billCloset = new NikeShoes(billCloset);

        System.out.println("착장은 : "+billCloset.closet());
        System.out.println("가격은 : "+billCloset.price()+"원");
    }

    @Test
    void test2(){
        BillCloset billCloset = new JumpSuit();

        billCloset = new MlbHat(billCloset);
        billCloset = new AdidasShoes(billCloset);

        System.out.println("착장은 : "+billCloset.closet());
        System.out.println("가격은 : "+billCloset.price()+"원");
    }

}