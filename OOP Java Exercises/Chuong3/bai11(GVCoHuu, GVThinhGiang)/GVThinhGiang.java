import java.util.Scanner;

class GVThinhGiang extends GiangVien {
    private int soTietDay;
    private double donGia;

    public GVThinhGiang() {
        loaiGiangVien = "Giang vien thinh giang";
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap so tiet day: ");
        soTietDay = scanner.nextInt();
        System.out.print("Nhap don gia moi tiet: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ dòng newline
    }

    @Override
    public double tinhLuong() {
        return soTietDay * donGia * 0.85; // Trừ 15% thu nhập
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Luong thang: " + tinhLuong());
    }
}