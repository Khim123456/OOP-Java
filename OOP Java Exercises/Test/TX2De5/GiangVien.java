import java.util.Scanner;

// Lớp trừu tượng GiangVien
public abstract class GiangVien {
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
    }

    // Phương thức trừu tượng tính lương
    public abstract double tinhLuong();

    // Phương thức in thông tin
    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
    }
}
