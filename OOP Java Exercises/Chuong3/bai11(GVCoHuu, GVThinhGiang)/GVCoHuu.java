import java.util.Scanner;

public class GVCoHuu extends GiangVien {
    private double luongCoBan;
    private double heSoLuong;
    private int thamNien;

    public GVCoHuu() {
        loaiGiangVien = "Giang vien co huu";
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap luong co ban: ");
        luongCoBan = scanner.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = scanner.nextDouble();
        System.out.print("Nhap so nam cong tac: ");
        thamNien = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ dòng newline
    }

    @Override
    public double tinhLuong() {
        double phuCap = (thamNien >= 5) ? (5 + (thamNien / 5)) * 0.01 * luongCoBan : 0;
        return luongCoBan * heSoLuong + phuCap;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Luong thang: " + tinhLuong());
    }
}
