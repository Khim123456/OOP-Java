import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện tiêu thụ
        System.out.print("Nhap so dien tieu thu trong thang: ");
        int electricity = scanner.nextInt();

        // Biến lưu số tiền phải thanh toán
        double totalAmount = 0;

        // Tính tiền điện theo bậc
        if (electricity <= 50) {
            totalAmount = electricity * 1484;
        } else if (electricity <= 100) {
            totalAmount = 50 * 1484 + (electricity - 50) * 1533;
        } else if (electricity <= 200) {
            totalAmount = 50 * 1484 + 50 * 1533 + (electricity - 100) * 1786;
        } else {
            totalAmount = 50 * 1484 + 50 * 1533 + 100 * 1786 + (electricity - 200) * 2242;
        }

        // Hiển thị kết quả
        System.out.println("So tien dien phai thanh toan: " + totalAmount + " VND");

        scanner.close();
    }
}