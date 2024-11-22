import java.util.Scanner;

public abstract class Hocvien {
    protected String hoTen;
    protected String diaChi;
    protected int loaiUuTien;
    protected String loaiChuongTrinh; // Có thể là "Đồ họa" hoặc "Lập trình"

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập loại ưu tiên (1 hoặc 2): ");
        loaiUuTien = scanner.nextInt();
        scanner.nextLine(); // Xử lý ký tự xuống dòng
        System.out.print("Nhập loại chương trình đăng kí (Đồ họa hoặc Lập trình): ");
        loaiChuongTrinh = scanner.nextLine();
    }

    // Phương thức trừu tượng tính học phí
    public abstract double hocPhi();

    // Phương thức in thông tin
    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Loại ưu tiên: " + loaiUuTien);
        System.out.println("Loại chương trình đăng kí học: " + loaiChuongTrinh);
        System.out.println("Học phí: " + hocPhi());
    }
}