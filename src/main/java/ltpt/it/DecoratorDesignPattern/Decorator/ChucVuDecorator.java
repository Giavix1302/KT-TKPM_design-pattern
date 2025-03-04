package ltpt.it.DecoratorDesignPattern.Decorator;

import ltpt.it.DecoratorDesignPattern.NhanVienComponent;

public abstract class ChucVuDecorator implements NhanVienComponent {
    protected NhanVienComponent nhanVien;

    public ChucVuDecorator(NhanVienComponent nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public void inThongTin() {
        nhanVien.inThongTin();
    }
}
