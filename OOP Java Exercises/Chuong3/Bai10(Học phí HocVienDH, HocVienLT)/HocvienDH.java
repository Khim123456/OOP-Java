import java.util.Scanner;
public class HocvienDH extends Hocvien {
    private int soBuoi;
    private static final int DON_GIA_DH = 500000; // Ví dụ: 500000 VNĐ mỗi buổi

    public HocvienDH() {
        loaiChuongTrinh = "Đồ họa";
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
        int uuTien = (loaiUuTien == 1) ? 1000000 : 500000;
        return soBuoi * DON_GIA_DH - uuTien;
    }
}