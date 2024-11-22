import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu n cua mang: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng số nguyên
        int[] a = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        // Hiển thị các phần tử vừa nhập
        System.out.println("Cac phan tu trong mang la:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        scanner.close();
    }
}