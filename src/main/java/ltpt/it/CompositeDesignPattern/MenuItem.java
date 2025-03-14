package ltpt.it.CompositeDesignPattern;

// Leaf: Đại diện cho sản phẩm đơn lẻ
class MenuItem extends MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("  " + name + " - " + price + "đ");
    }
}

