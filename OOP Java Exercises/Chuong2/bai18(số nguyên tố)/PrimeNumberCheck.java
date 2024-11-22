import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.print("Nhap mot so nguyen: ");
        int number = scanner.nextInt();

        // Kiểm tra và hiển thị kết quả
        if (isPrime(number)) {
            System.out.println(number + " la so nguyen to!");
        } else {
            System.out.println(number + " khong phai so nguyen to!");
        }

        scanner.close();
    }

    // Phương thức kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Các số nhỏ hơn 2 không phải là số nguyên tố
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu n chia hết cho i, thì không phải số nguyên tố
            }
        }
        return true; // Nếu không chia hết cho số nào, thì là số nguyên tố
    }
}