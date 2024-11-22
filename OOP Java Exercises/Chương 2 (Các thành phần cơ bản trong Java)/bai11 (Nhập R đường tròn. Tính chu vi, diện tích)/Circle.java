import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính
        System.out.print("Nhap ban kinh cua hinh tron: ");
        double radius = scanner.nextDouble();

        // Tính diện tích và chu vi
        double area = Math.PI * radius * radius; // Diện tích = π * r^2
        double circumference = 2 * Math.PI * radius; // Chu vi = 2 * π * r

        // Hiển thị kết quả
        System.out.println("Dien tich hinh tron la: " + area);
        System.out.println("Chu vi hinh tron la: " + circumference);

        scanner.close();
    }
}