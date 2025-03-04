package ltpt.it.StateDesignPattern.states;

public class NhanVienState implements ChucVuState {
    @Override
    public void inChucVu() {
        System.out.println("Nhiem vu cua nhan vien");
    }
}
