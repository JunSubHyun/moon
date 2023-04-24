package study.moon.book0424;

public class PriceUpdate implements Command{

    private Order order;

    private int price;

    public PriceUpdate(Order order, int price) {
        this.order = order;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("가격을 수정 했습니다.");
        System.out.println("수정된 가격 :" + price);
    }

    @Override
    public void execute() {
        order.setPrice(price);
    }
}
