import java.util.Scanner;

class SVCDCQ extends Nguoi {
    private double TDKT;   // Tổng điểm các môn kiểm tra
    private int SMKT;      // Số môn kiểm tra
    private double DTKTHP; // Điểm thi kết thúc học phần

    public SVCDCQ() {
        loaiSinhVien = "SVCDCQ"; // Loại sinh viên cao đẳng chính quy
    }

    // Nhập thông tin cho sinh viên cao đẳng chính quy
    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhap tong diem cac mon kiem tra: ");
        TDKT = scanner.nextDouble();
        System.out.print("Nhap so mon kiem tra: ");
        SMKT = scanner.nextInt();
        System.out.print("Nhap diem thi ket thuc hoc phan: ");
        DTKTHP = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ dòng newline
    }

    // Tính điểm trung bình cho sinh viên cao đẳng chính quy
    @Override
    public double tinhDiem() {
        return (TDKT / SMKT + DTKTHP) / 3;
    }
}