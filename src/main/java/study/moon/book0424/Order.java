package study.moon.book0424;

import lombok.Data;

@Data
public class Order {

    private User user;

    private String product;

    private int price;

    private int count;

    public Order(User user, String product, int price, int count) {
        this.user = user;
        this.product = product;
        this.price = price;
        this.count = count;
    }
}
