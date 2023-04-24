package study.moon.book0424;

public class CountUpdate implements Command{

    private Order order;

    private int count;

    public CountUpdate(Order order, int count) {
        this.order = order;
        this.count = count;
    }

    @Override
    public void display() {
        System.out.println("상품 수량을 업데이트 했습니다.");
        System.out.println("수량 :" + count);
    }

    @Override
    public void execute() {
        order.setCount(count);
    }
}
