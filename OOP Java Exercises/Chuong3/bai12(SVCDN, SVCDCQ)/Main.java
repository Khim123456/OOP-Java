import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng sinh viên cao đẳng nghề và chính quy
        Nguoi sv1 = new SVCDN();
        Nguoi sv2 = new SVCDCQ();

        // Nhập thông tin cho sinh viên cao đẳng nghề
        System.out.println("Nhap thong tin cho sinh vien cao dang nghe:");
        sv1.nhapThongTin(scanner);

        // Nhập thông tin cho sinh viên cao đẳng chính quy
        System.out.println("Nhap thong tin cho sinh vien cao dang chinh quy:");
        sv2.nhapThongTin(scanner);

        // In thông tin sinh viên cao đẳng nghề
        System.out.println("\nThong tin sinh vien cao dang nghe:");
        sv1.inThongTin();

        // In thông tin sinh viên cao đẳng chính quy
        System.out.println("\nThong tin sinh vien cao dang chinh quy:");
        sv2.inThongTin();
    }
}