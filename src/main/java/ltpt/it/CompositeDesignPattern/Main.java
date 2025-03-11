package ltpt.it.CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        MenuItem caphe = new MenuItem("Cà phê đen", 20000);
        MenuItem caphesua = new MenuItem("Cà phê sữa", 25000);
        MenuItem trasua = new MenuItem("Trà sữa", 30000);
        MenuItem nuocsuoi = new MenuItem("Nước suối", 10000);
        MenuItem banhngot = new MenuItem("Bánh ngọt", 15000);

        // Tạo quán cà phê
        CafeShop cafeShop = new CafeShop("Cafe Xinh");

        // Tạo các bàn
        Table table1 = new Table(1);
        Table table2 = new Table(2);
        Table table3 = new Table(3);

        // Thêm sản phẩm vào bàn 1
        table1.add(caphe);
        table1.add(banhngot);

        // Thêm sản phẩm vào bàn 2
        table2.add(caphesua);
        table2.add(trasua);

        // Thêm sản phẩm vào bàn 3
        table3.add(nuocsuoi);
        table3.add(trasua);
        table3.add(banhngot);

        // Thêm các bàn vào quán cà phê
        cafeShop.add(table1);
        cafeShop.add(table2);
        cafeShop.add(table3);

        // In thông tin doanh thu
        cafeShop.print();
    }
}
