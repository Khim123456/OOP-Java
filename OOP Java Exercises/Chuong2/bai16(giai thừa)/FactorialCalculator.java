import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên n
        System.out.print("Nhap mot so nguyen n: ");
        int n = scanner.nextInt();

        // Kiểm tra số âm
        if (n < 0) {
            System.out.println("Giai thua khong dinh nghia cho so am!");
        } else {
            // Tính giai thừa
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Hiển thị kết quả
            System.out.println("Giai thua cua " + n + " la: " + factorial);
        }

        scanner.close();
    }
}