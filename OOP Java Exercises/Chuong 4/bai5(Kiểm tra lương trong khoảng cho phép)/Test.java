import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Yêu cầu người dùng nhập lương
            System.out.print("Nhap luong cua mot nguoi (5.000.000 den 20.000.000): ");
            double salary = scanner.nextDouble();

            // Kiểm tra lương có nằm trong phạm vi cho phép không
            if (salary < 5000000 || salary > 20000000) {
                throw new OutOfRangeException("Error! Luong phai nam trong khoang tu 5.000.000 den 20.000.000.");
            }

            // Nếu hợp lệ, hiển thị lương
            System.out.println("Luong la: " + salary + " VND");

        } catch (OutOfRangeException e) {
            // Xử lý ngoại lệ OutOfRangeException
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Xử lý các ngoại lệ khác (nếu có)
            System.out.println("Da xay ra loi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}