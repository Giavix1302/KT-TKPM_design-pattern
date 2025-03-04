package ltpt.it.StrategyDesignPattern.strategy;

import ltpt.it.StrategyDesignPattern.NhanVien;

public class InChucVuGiamDoc implements ChucVuStrategy {
    @Override
    public void inChucVu(NhanVien nhanVien) {
        if ("Giam Doc".equalsIgnoreCase(nhanVien.getChucVu())) {
            System.out.println(nhanVien.getName() + " la Giam Doc.");
        }
    }
}
