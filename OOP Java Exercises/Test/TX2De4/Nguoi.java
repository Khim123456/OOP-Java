import java.util.Scanner;

// Lớp trừu tượng Nguoi
public abstract class Nguoi {
    // Thuộc tính
    protected String hoTen;
    protected String ngaySinh;
    protected String diaChi;

    // Constructor không tham số
    public Nguoi() {
    }

    // Constructor đầy đủ tham số
    public Nguoi(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = scanner.nextLine();
    }

    // Phương thức in thông tin
    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
    }

    // Phương thức trừu tượng tính điểm
    public abstract double tinhDiem();
}
