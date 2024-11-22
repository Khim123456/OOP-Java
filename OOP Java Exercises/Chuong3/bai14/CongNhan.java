import java.util.Scanner;

// Lớp trừu tượng CongNhan
public abstract class CongNhan {
    protected String hoTen;
    protected String diaChi;
    protected String ngaySinh;
    protected String loaiCongNhan;

    // Phương thức trừu tượng tính lương
    public abstract double tinhLuong();

    // Nhập thông tin chung
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap loai cong nhan (CNKSP hoac CNTCN): ");
        loaiCongNhan = scanner.nextLine();
    }

    // In thông tin
    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Loai cong nhan: " + loaiCongNhan);
        System.out.println("Luong thang: " + tinhLuong());
    }
}
