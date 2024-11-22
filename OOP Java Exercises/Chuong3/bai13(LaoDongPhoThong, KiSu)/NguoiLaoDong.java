import java.util.Scanner;

public abstract class NguoiLaoDong {
    protected String hoTen;
    protected String diaChi;
    protected String loaiLaoDong; // Lao động phổ thông hoặc Kỹ sư

    // Phương thức trừu tượng tính lương
    public abstract double tinhLuong();

    // Nhập thông tin cho người lao động
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap loai lao dong (Lao dong pho thong / Ky su): ");
        loaiLaoDong = scanner.nextLine();
    }

    // In thông tin người lao động
    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Loai lao dong: " + loaiLaoDong);
        System.out.println("Luong thang: " + tinhLuong());
    }
}