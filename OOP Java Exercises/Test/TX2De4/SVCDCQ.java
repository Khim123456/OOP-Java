import java.util.Scanner;

// Lớp SVCDCQ kế thừa Nguoi và cài đặt phương thức tính điểm
public class SVCDCQ extends Nguoi implements SVCDN {
    // Thuộc tính
    private String maSV;       // Mã sinh viên
    private double diemTDTK;   // Tổng điểm các môn kiểm tra
    private int soMonSMKT;     // Số môn kiểm tra
    private double diemKTTHP;  // Điểm thi kết thúc học phần

    // Constructor
    public SVCDCQ(String maSV, String hoTen, String ngaySinh, String diaChi, double diemTDTK, int soMonSMKT, double diemKTTHP) {
        super(hoTen, ngaySinh, diaChi);
        this.maSV = maSV;
        this.diemTDTK = diemTDTK;
        this.soMonSMKT = soMonSMKT;
        this.diemKTTHP = diemKTTHP;
    }

    // Phương thức nhập thông tin
    @Override
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = scanner.nextLine();
        super.nhapThongTin();
        System.out.print("Nhap tong diem cac mon kiem tra: ");
        this.diemTDTK = scanner.nextDouble();
        System.out.print("Nhap so mon kiem tra: ");
        this.soMonSMKT = scanner.nextInt();
        System.out.print("Nhap diem thi ket thuc hoc phan: ");
        this.diemKTTHP = scanner.nextDouble();
    }

    // Getter cho mã sinh viên
    public String getMaSV() {
        return maSV;
    }

    // Phương thức tính điểm trung bình
    @Override
    public double tinhDiem() {
        return (diemTDTK / soMonSMKT + diemKTTHP) / 2;
    }

    // Phương thức in thông tin
    @Override
    public void inThongTin() {
        System.out.println("Ma sinh vien: " + maSV);
        super.inThongTin();
        System.out.println("Diem trung binh: " + tinhDiem());
    }
}
