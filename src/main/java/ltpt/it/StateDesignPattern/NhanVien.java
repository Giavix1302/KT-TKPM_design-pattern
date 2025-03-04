package ltpt.it.StateDesignPattern;

import ltpt.it.StateDesignPattern.states.ChucVuState;

public class NhanVien {
    private int id;
    private String name;
    private ChucVuState chucVu;

    public NhanVien(int id, String name, ChucVuState chucVu) {
        this.id = id;
        this.name = name;
        this.chucVu = chucVu;
    }

    public void setChucVu(ChucVuState chucVu) {
        this.chucVu = chucVu;
    }

    public void inThongTin() {
        System.out.println("ID: " + id + ", Tên: " + name);
        chucVu.inChucVu();
    }

}
