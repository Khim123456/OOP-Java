import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
    private int soNgayCong;
    private double donGiaNgayCong;

    public LaoDongPhoThong() {
        loaiLaoDong = "Lao dong pho thong"; // Loại lao động phổ thông
    }

    // Nhập thông tin cho lao động phổ thông
    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = scanner.nextInt();
        System.out.print("Nhap don gia ngay cong: ");
        donGiaNgayCong = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ dòng newline
    }

    // Tính lương cho lao động phổ thông
    @Override
    public double tinhLuong() {
        double thuong = 0;
        if (soNgayCong >= 25) {
            thuong = 1000000;
        } else if (soNgayCong > 15) {
            thuong = 700000;
        }

        return soNgayCong * donGiaNgayCong + thuong;
    }
}