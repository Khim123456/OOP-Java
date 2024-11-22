import java.util.Scanner;

public abstract class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;
    protected String loaiSinhVien;

    // Phương thức trừu tượng tính điểm
    public abstract double tinhDiem();

    // Nhập thông tin cho sinh viên
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap loai sinh vien (SVCDN hoac SVCDCQ): ");
        loaiSinhVien = scanner.nextLine();
    }

    // In thông tin sinh viên
    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Loai sinh vien: " + loaiSinhVien);
        System.out.println("Diem trung binh: " + tinhDiem());
    }
}
