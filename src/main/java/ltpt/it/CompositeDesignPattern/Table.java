package ltpt.it.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Lớp Table kế thừa từ MenuComposite để đại diện cho một bàn
class Table extends MenuComposite {
    private int tableNumber;

    public Table(int tableNumber) {
        super("Bàn số " + tableNumber);
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    @Override
    public void print() {
        System.out.println("Bàn số " + tableNumber + " - Tổng: " + calculatePrice() + "đ");
        System.out.println("--------------------");

        for (int i = 0; i < getMenuComponents().size(); i++) {
            getMenuComponents().get(i).print();
        }

        System.out.println("--------------------");
    }

    // Phương thức để truy cập danh sách menuComponents
    private List<MenuComponent> getMenuComponents() {
        // Đây là một cách giải quyết để truy cập thuộc tính private từ lớp cha
        // Trong thực tế, có thể cân nhắc việc thay đổi phạm vi truy cập của menuComponents
        List<MenuComponent> components = new ArrayList<>();
        for (int i = 0; i < 100; i++) { // Giả sử không quá 100 sản phẩm
            try {
                components.add(getChild(i));
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return components;
    }
}

