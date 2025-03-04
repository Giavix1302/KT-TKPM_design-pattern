package ltpt.it.StrategyDesignPattern.strategy;

import ltpt.it.StrategyDesignPattern.NhanVien;

public class Context {
    private ChucVuStrategy strategy;

    public Context(ChucVuStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(NhanVien nhanVien) {
        strategy.inChucVu(nhanVien);
    }
}
