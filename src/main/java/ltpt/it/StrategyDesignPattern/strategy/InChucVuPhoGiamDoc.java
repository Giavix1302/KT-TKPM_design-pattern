package ltpt.it.StrategyDesignPattern.strategy;

import ltpt.it.StrategyDesignPattern.NhanVien;

public class InChucVuPhoGiamDoc implements ChucVuStrategy {
    @Override
    public void inChucVu(NhanVien nhanVien) {
        if ("Pho Giam Doc".equalsIgnoreCase(nhanVien.getChucVu())) {
            System.out.println(nhanVien.getName() + "la pho giam doc");
        }
    }
}
