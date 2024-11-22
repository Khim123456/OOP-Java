import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
    private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;

    public KiSu() {
        loaiLaoDong = "Ki su"; // Loại kỹ sư
    }

    // Nhập thông tin cho kỹ sư
    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap luong co ban: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ dòng newline
    }

    // Tính lương cho kỹ sư
    @Override
    public double tinhLuong() {
        double thuong = 0;
        if (soNgayCong >= 25) {
            thuong = 2000000;
        } else if (soNgayCong > 15) {
            thuong = 1000000;
        } else {
            thuong = 500000;
        }

        return luongCoBan * heSoLuong + thuong;
    }
}

