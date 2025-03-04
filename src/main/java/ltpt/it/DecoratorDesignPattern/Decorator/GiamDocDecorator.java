package ltpt.it.DecoratorDesignPattern.Decorator;

import ltpt.it.DecoratorDesignPattern.NhanVienComponent;

public class GiamDocDecorator extends ChucVuDecorator {
    public GiamDocDecorator(NhanVienComponent nhanVien) {
        super(nhanVien);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Nhiem vu cua giam doc");
    }
}
