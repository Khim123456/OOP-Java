import java.util.Scanner;

// Lớp GVCohuu kế thừa từ GiangVien
public class GVCoHuu extends GiangVien {
    private double luongCoBan;
    private double heSoLuong;
    private int thamNien;

    // Nhập thông tin giảng viên cơ hữu
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong co ban (LCB): ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("Nhap tham nien (so nam): ");
        thamNien = scanner.nextInt();
    }

    // Tính lương
    @Override
    public double tinhLuong() {
        double phuCap = 0;
        if (thamNien > 5) {
            phuCap = 0.05 * luongCoBan + (thamNien - 5) * 0.01 * luongCoBan;
        }
        return luongCoBan * heSoLuong + phuCap;
    }

    // In thông tin giảng viên cơ hữu
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Tham nien: " + thamNien + " nam");
        System.out.println("Luong thang: " + tinhLuong());
    }
}
