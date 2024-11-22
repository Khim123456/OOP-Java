import java.util.Scanner;

public class CNTCN extends CongNhan {
    private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;

    public CNTCN() {
        loaiCongNhan = "CNTCN"; // Đặt loại công nhân là CNTCN
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap luong co ban: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự newline
    }

    @Override
    public double tinhLuong() {
        double thuong = 0;
        if (soNgayCong >= 20) {
            thuong = 1.2 * luongCoBan;
        }
        return luongCoBan * heSoLuong + thuong;
    }
}