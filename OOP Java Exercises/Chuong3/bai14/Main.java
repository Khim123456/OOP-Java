import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng công nhân khoán sản phẩm và công nhật
        CongNhan cnksp = new CNKSP();
        CongNhan cntcn = new CNTCN();

        // Nhập thông tin cho CNKSP
        System.out.println("Nhap thong tin cho cong nhan khoan san pham:");
        cnksp.nhapThongTin(scanner);

        // Nhập thông tin cho CNTCN
        System.out.println("\nNhap thong tin cho cong nhan tinh cong nhat:");
        cntcn.nhapThongTin(scanner);

        // In thông tin CNKSP
        System.out.println("\nThong tin cong nhan khoan san pham:");
        cnksp.inThongTin();

        // In thông tin CNTCN
        System.out.println("\nThong tin cong nhan tinh cong nhat:");
        cntcn.inThongTin();

        scanner.close();
    }
}
    

