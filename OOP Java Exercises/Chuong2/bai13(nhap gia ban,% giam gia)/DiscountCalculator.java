import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá bán ban đầu
        System.out.print("Nhap gia ban ban dau cua san pham: ");
        double originalPrice = scanner.nextDouble();

        // Nhập phần trăm giảm giá
        System.out.print("Nhap phan tram giam gia (%): ");
        double discountPercentage = scanner.nextDouble();

        // Tính giá sau khi giảm
        double discountAmount = originalPrice * (discountPercentage / 100);
        double finalPrice = originalPrice - discountAmount;

        // Hiển thị kết quả
        System.out.println("So tien duoc giam: " + discountAmount);
        System.out.println("Gia ban sau khi giam: " + finalPrice);

        scanner.close();
    }
}