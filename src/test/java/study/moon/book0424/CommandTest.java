package study.moon.book0424;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    private User user;

    private Order order;

    private CompositeCommand compositeCommand;

    @BeforeEach
    void saveData(){
        user = new User("현준섭", "010-2589-0503");
        order = new Order(user,"기본상품",3000,2);
        compositeCommand = new CompositeCommand();
    }

    @Test
    void orderProduct(){
        compositeCommand.addCommand(new ProductOrder(order,user,"주문상품",4000));
        compositeCommand.execute();
        compositeCommand.display();
    }

    @Test
    void countUpdate(){
        compositeCommand.addCommand(new CountUpdate(order,5));
        compositeCommand.execute();
        compositeCommand.display();
    }

    @Test
    void priceUpdate(){
        compositeCommand.addCommand(new PriceUpdate(order,6000));
        compositeCommand.execute();
        compositeCommand.display();
    }

}