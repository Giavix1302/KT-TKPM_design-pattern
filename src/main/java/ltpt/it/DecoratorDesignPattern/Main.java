package ltpt.it.DecoratorDesignPattern;

import ltpt.it.DecoratorDesignPattern.Decorator.GiamDocDecorator;
import ltpt.it.DecoratorDesignPattern.Decorator.PhoGiamDocDecorator;

public class Main {
    public static void main(String[] args) {
        // Tạo nhân viên cơ bản
        NhanVienComponent nhanVien = new NhanVien(1, "Nguyễn Văn A");
        nhanVien.inThongTin();
        System.out.println("-----------------");

        // Thêm chức vụ
        NhanVienComponent truongPhong = new GiamDocDecorator(nhanVien);
        truongPhong.inThongTin();
        System.out.println("-----------------");

        // Thêm chức vụ
        NhanVienComponent giamDoc = new PhoGiamDocDecorator(truongPhong);
        giamDoc.inThongTin();
    }
}
