package study.moon.book0514;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItem = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨", true, 2.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItem >= MAX_ITEMS){
            System.out.println("죄송합니다, 메뉴가 꽉 찼습니다");
        }else {
            menuItems[numberOfItem] = menuItem;
            numberOfItem = numberOfItem +1;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
