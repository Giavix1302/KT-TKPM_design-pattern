package ltpt.it.noDesignPaterrn;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Gia vi", ChucVu.GIAMDOC);
        employee.getNhienVu();

        employee.setChucVu(ChucVu.NHANVIEN);
        employee.getNhienVu();

    }

}