package ltpt.it.CompositeDesignPattern;


import java.util.ArrayList;
import java.util.List;

// Composite: Đại diện cho một nhóm các thành phần
class MenuComposite extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;

    public MenuComposite(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0;
        for (MenuComponent menuComponent : menuComponents) {
            totalPrice += menuComponent.calculatePrice();
        }
        return totalPrice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return calculatePrice();
    }

    @Override
    public void print() {
        System.out.println(name + " - Tổng: " + calculatePrice() + "đ");
        System.out.println("--------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }

        System.out.println("--------------------");
    }
}

