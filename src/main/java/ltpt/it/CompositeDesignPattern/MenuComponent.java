package ltpt.it.CompositeDesignPattern;


// Component: Thành phần cơ bản trong mẫu Composite
abstract class MenuComponent {
    public abstract double calculatePrice();
    public abstract String getName();
    public abstract double getPrice();
    public abstract void print();
}
