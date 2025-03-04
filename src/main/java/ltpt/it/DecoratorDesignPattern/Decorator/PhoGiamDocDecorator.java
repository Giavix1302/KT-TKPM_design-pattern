package ltpt.it.DecoratorDesignPattern.Decorator;

import ltpt.it.DecoratorDesignPattern.NhanVienComponent;

public class PhoGiamDocDecorator extends ChucVuDecorator {
    public PhoGiamDocDecorator(NhanVienComponent nhanVien) {
        super(nhanVien);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Nhiem vu của pho giam doc");
    }
}
