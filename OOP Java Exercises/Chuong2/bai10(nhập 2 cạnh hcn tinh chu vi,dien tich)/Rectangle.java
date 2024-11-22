import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double length = scanner.nextDouble();

        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double width = scanner.nextDouble();

        // Tính diện tích và chu vi
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Hiển thị kết quả
        System.out.println("Dien tich hinh chu nhat la: " + area);
        System.out.println("Chu vi hinh chu nhat la: " + perimeter);

        scanner.close();
    }
}