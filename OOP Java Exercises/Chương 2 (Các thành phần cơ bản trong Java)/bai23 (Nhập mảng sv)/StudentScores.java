import java.util.Arrays;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng điểm cho n sinh viên
        int[] scores = new int[n];

        // Nhập điểm của từng sinh viên
        System.out.println("Nhap diem cho tung sinh vien (thang diem 100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Diem cua sinh vien thu " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Tìm điểm cao nhất và sinh viên có điểm cao nhất
        int maxScore = scores[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }

        // Sắp xếp điểm theo thứ tự tăng dần
        Arrays.sort(scores);

        // Hiển thị kết quả
        System.out.println("\nKet qua:");
        System.out.println("Diem cao nhat: " + maxScore);
        System.out.println("Sinh vien co diem cao nhat: Sinh vien thu " + (maxIndex + 1));
        System.out.println("Diem cua tat ca sinh vien theo thu tu tang dan:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        scanner.close();
    }
}