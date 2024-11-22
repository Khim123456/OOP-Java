public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Bệnh Viện
        BenhVien bv = new BenhVien("Bệnh viện Bạch Mai", "Hà Nội", "Nguyễn Văn A");

        // Tạo đối tượng Bệnh Nhân
        BenhNhan bn = new BenhNhan("Trần Văn B", 30, 'M', "Không có", "Cảm cúm", bv);

        // Hiển thị thông tin bệnh nhân
        System.out.println(bn.toString());
    }
}
