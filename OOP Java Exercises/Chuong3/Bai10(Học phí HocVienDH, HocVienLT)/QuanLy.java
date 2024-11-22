public class QuanLy {
    public static void main(String[] args) {
        Hocvien hocvienDH = new HocvienDH();
        Hocvien hocvienLT = new HocvienLT();

        System.out.println("Nhập thông tin cho học viên Đồ họa:");
        hocvienDH.nhapThongTin();

        System.out.println("Nhập thông tin cho học viên Lập trình:");
        hocvienLT.nhapThongTin();

        System.out.println("\nThông tin học viên Đồ họa:");
        hocvienDH.inThongTin();

        System.out.println("\nThông tin học viên Lập trình:");
        hocvienLT.inThongTin();
    }
}
