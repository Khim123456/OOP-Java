import java.util.Scanner;

// Lớp GVThinhGiangImpl
public class GVThinhGiangImpl extends GiangVien implements GVThinhGiang {
    private int soTietDay;
    private double donGia;

    // Nhập thông tin giảng viên thỉnh giảng
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tiet day: ");
        soTietDay = scanner.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
    }

    // Tính lương thỉnh giảng
    @Override
    public double tinhLuongThinhGiang() {
        return 0.15 * soTietDay * donGia;
    }

    @Override
    public double tinhLuong() {
        return tinhLuongThinhGiang();
    }

    // In thông tin giảng viên thỉnh giảng
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("So tiet day: " + soTietDay);
        System.out.println("Don gia: " + donGia);
        System.out.println("Luong thang: " + tinhLuong());
    }
}
