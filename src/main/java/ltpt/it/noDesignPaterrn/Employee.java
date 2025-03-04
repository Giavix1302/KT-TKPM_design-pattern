package ltpt.it.noDesignPaterrn;

public class Employee {
    private int id;
    private String name;
    private ChucVu chucVu;

    public Employee(int id, String name, ChucVu chucVu) {
        this.id = id;
        this.name = name;
        this.chucVu = chucVu;
    }

    public void getNhienVu() {
        if(chucVu == ChucVu.GIAMDOC) {
            System.out.println("Nhiem vu cua GIAMDOC");
        } else if(chucVu == ChucVu.GIAMDOC) {
            System.out.println("Nhiem vu cua PHOGIAMDOC");
        } else if(chucVu == ChucVu.GIAMDOC) {
            System.out.println("Nhiem vu cua KETTOAN");
        } else {
            System.out.println("Nhiem vu cua NHANVIEN");
        }

    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }
}
