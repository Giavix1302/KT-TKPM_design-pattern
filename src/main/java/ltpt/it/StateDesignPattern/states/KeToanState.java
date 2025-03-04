package ltpt.it.StateDesignPattern.states;

public class KeToanState implements ChucVuState {
    @Override
    public void inChucVu() {
        System.out.println("Nhiem vu cua ke toan");
    }
}
