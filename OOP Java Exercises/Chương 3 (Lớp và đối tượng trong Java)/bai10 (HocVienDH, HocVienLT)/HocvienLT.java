import java.util.Scanner;
public class HocvienLT extends Hocvien {
    private int soBuoi;
    private static final int DON_GIA_LT = 600000; // Ví dụ: 600000 VNĐ mỗi buổi

    public HocvienLT() {
        loaiChuongTrinh = "Lập trình";
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số buổi học: ");
        soBuoi = scanner.nextInt();
    }

    @Override
    public double hocPhi() {
        int uuTien = (loaiUuTien == 1) ? 1000000 : 800000;
        return soBuoi * DON_GIA_LT - uuTien;
    }
}