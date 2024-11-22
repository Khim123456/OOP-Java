import java.util.Scanner;

public abstract class GiangVien {
    protected String hoTen;
    protected String diaChi;
    protected String loaiGiangVien;

    public abstract double tinhLuong();

    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
    }

    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Loai giang vien: " + loaiGiangVien);
    }
}
