package ltpt.it.StrategyDesignPattern.strategy;


import ltpt.it.StrategyDesignPattern.NhanVien;

public class InChucVuNhanVien implements ChucVuStrategy {
    @Override
    public void inChucVu(NhanVien nhanVien) {
        if ("Nhan Vien".equalsIgnoreCase(nhanVien.getChucVu())) {
            System.out.println(nhanVien.getName() + " la nhan vien.");
        }
    }
}
