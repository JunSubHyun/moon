package study.moon.book0424;

public class ProductOrder implements Command{

    private Order order;

    private User user;

    private String product;

    private int price;

    public ProductOrder(Order order, User user, String product, int price) {
        this.order = order;
        this.user = user;
        this.product = product;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("상품을 주문했습니다.");
        System.out.println("주문 회원 : " +user.getName());
        System.out.println("주문 상품 : " +product);
        System.out.println("주문 가격 : " +price);
    }

    @Override
    public void execute() {
        order.setUser(user);
        order.setProduct(product);
        order.setPrice(price);
    }
}
