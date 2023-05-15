package study.moon.bookPa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HeyGoogleTest {

    @Test
    void test(){
        Time time = new Time();
        Air air = new Air();
        Weather weather = new Weather();

        HeyGoogle heyGoogle = new HeyGoogle(time,air,weather);

        //오늘
        heyGoogle.morning();
        System.out.println("=====================================");
        //내일
        heyGoogle.tomorrow();
    }


}