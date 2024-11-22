import java.util.Scanner;

public class HotelBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số ngày lưu trú và đơn giá ngày
        System.out.print("Nhap so ngay luu tru: ");
        int days = scanner.nextInt();
        System.out.print("Nhap don gia cho moi ngay: ");
        double dailyRate = scanner.nextDouble();

        // Biến lưu tổng tiền phải thanh toán
        double totalAmount;

        // Tính tiền theo số ngày lưu trú
        if (days == 1) {
            totalAmount = days * dailyRate; // Không giảm giá
        } else if (days >= 2 && days <= 4) {
            totalAmount = days * dailyRate * 0.8; // Giảm 20%
        } else if (days >= 5 && days <= 10) {
            totalAmount = days * dailyRate * 0.6; // Giảm 40%
        } else {
            totalAmount = days * dailyRate * 0.4; // Giảm 60%
        }

        // Hiển thị kết quả
        System.out.println("Tong tien phong phai thanh toan: " + totalAmount + " VND");

        scanner.close();
    }
}