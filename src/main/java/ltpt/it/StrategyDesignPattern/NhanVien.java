package ltpt.it.StrategyDesignPattern;

public class NhanVien {
    private int id;
    private String name;
    private String chucVu;

    public NhanVien(int id, String name, String chucVu) {
        this.id = id;
        this.name = name;
        this.chucVu = chucVu;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getChucVu() {
        return chucVu;
    }
}
