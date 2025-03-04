package ltpt.it.StrategyDesignPattern;

import ltpt.it.StrategyDesignPattern.strategy.*;

public class Main {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien(1, "Nguyen Van A", "Giam Doc");
        NhanVien nhanVien2 = new NhanVien(2, "Tran Thi B", "Pho Giam Doc");
        NhanVien nhanVien3 = new NhanVien(3, "Le Van C", "Nhan Vien");

        Context context = new Context(new InChucVuGiamDoc());
        context.executeStrategy(nhanVien1);

        context = new Context(new InChucVuNhanVien());
        context.executeStrategy(nhanVien2);

        context = new Context(new InChucVuPhoGiamDoc());
        context.executeStrategy(nhanVien3);
    }
}
