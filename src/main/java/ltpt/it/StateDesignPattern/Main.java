package ltpt.it.StateDesignPattern;

import ltpt.it.StateDesignPattern.states.*;

public class Main {
    public static void main(String[] args) {
        // Tạo nhân viên ban đầu với chức vụ "Nhân viên"
        NhanVien nv1 = new NhanVien(1, "Nguyễn Văn A", new NhanVienState());
        nv1.inThongTin();

        // Thăng chức lên Trưởng phòng
        nv1.setChucVu(new KeToanState());
        nv1.inThongTin();

        // Thăng chức lên Giám đốc
        nv1.setChucVu(new GiamDocState());
        nv1.inThongTin();
    }
}