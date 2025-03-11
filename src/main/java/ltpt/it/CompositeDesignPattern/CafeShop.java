package ltpt.it.CompositeDesignPattern;


import java.util.ArrayList;
import java.util.List;

// Lớp CafeShop kế thừa từ MenuComposite để đại diện cho một quán cà phê
class CafeShop extends MenuComposite {
    private String shopName;

    public CafeShop(String shopName) {
        super(shopName);
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public void print() {
        System.out.println("DOANH THU QUÁN " + shopName.toUpperCase());
        System.out.println("============================");
        System.out.println("Tổng doanh thu: " + calculatePrice() + "đ");
        System.out.println("============================");

        for (int i = 0; i < getMenuComponents().size(); i++) {
            getMenuComponents().get(i).print();
        }
    }

    // Phương thức để truy cập danh sách menuComponents
    private List<MenuComponent> getMenuComponents() {
        // Tương tự như phương thức trong Table
        List<MenuComponent> components = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            try {
                components.add(getChild(i));
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return components;
    }
}
