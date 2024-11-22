import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu n cua mang: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng số thực
        double[] a = new double[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            a[i] = scanner.nextDouble();
        }

        // Tính tổng giá trị các phần tử
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        // Hiển thị kết quả
        System.out.printf("Tong gia tri cac phan tu trong mang = %.2f\n", sum);

        scanner.close();
    }
}