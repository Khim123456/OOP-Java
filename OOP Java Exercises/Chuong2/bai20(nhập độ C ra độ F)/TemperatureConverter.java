import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập nhiệt độ C từ bàn phím
        System.out.print("Nhap nhiet do (°C): ");
        double celsius = scanner.nextDouble();

        // Tính nhiệt độ tương ứng ở độ F
        double fahrenheit = (celsius * 1.8) + 32;

        // Hiển thị kết quả
        System.out.printf("Nhiet do tuong ung o do F: %.2f°F\n", fahrenheit);

        scanner.close();
    }
}