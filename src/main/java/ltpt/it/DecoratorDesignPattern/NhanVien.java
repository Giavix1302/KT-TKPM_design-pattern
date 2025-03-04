package ltpt.it.DecoratorDesignPattern;

public class NhanVien implements NhanVienComponent {
    private int id;
    private String name;

    public NhanVien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void inThongTin() {
        System.out.println("ID: " + id + ", Tên: " + name);
    }
}
