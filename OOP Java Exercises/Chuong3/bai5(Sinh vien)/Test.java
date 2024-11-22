public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng trường
        Truong truong1 = new Truong("Truong Dai hoc Cong Nghiep Ha Noi", "Ha Noi", "Nguyen Van A");

        // Tạo đối tượng sinh viên
        SinhVien sinhVien1 = new SinhVien("Nguyen Thi B", 20, 'M', "CNTT01", "CNTT", truong1);

        // In thông tin sinh viên
        System.out.println(sinhVien1.toString());
    }
}