package study.moon.book0317;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DuckTest {

    @Test
    void Fly_Quack_Test(){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuck();
    }

    @Test
    void Nofly_Mute_Test(){
        BlackDuck blackDuck = new BlackDuck();
        blackDuck.display();
        blackDuck.performQuck();
    }



}