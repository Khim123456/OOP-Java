import java.util.Scanner;

public class SVCDN extends Nguoi {
    private double TDKT; // Tổng điểm các môn kiểm tra
    private int SMKT;    // Số môn kiểm tra

    public SVCDN() {
        loaiSinhVien = "SVCDN"; // Loại sinh viên cao đẳng nghề
    }

    // Nhập thông tin cho sinh viên cao đẳng nghề
    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap tong diem cac mon kiem tra: ");
        TDKT = scanner.nextDouble();
        System.out.print("Nhap so mon kiem tra: ");
        SMKT = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ dòng newline
    }

    // Tính điểm trung bình cho sinh viên cao đẳng nghề
    @Override
    public double tinhDiem() {
        return TDKT / SMKT;
    }
}