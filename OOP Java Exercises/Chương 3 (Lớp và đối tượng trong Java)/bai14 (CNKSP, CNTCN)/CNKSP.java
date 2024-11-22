import java.util.Scanner;

public class CNKSP extends CongNhan {
    private int soSanPham;
    private double donGiaSanPham;

    public CNKSP() {
        loaiCongNhan = "CNKSP"; // Đặt loại công nhân là CNKSP
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap so san pham: ");
        soSanPham = scanner.nextInt();
        System.out.print("Nhap don gia san pham: ");
        donGiaSanPham = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ ký tự newline
    }

    @Override
    public double tinhLuong() {
        double thuong = 0;
        if (soSanPham >= 150) {
            thuong = 1500000;
        } else if (soSanPham >= 100) {
            thuong = 1000000;
        }
        return soSanPham * donGiaSanPham + thuong;
    }
}