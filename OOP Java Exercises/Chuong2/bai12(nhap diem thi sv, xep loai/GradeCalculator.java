import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm thi của sinh viên
        System.out.print("Nhap diem thi cua sinh vien (thang diem 100): ");
        double score = scanner.nextDouble();

        // Xác định xếp loại
        if (score >= 90 && score <= 100) {
            System.out.println("Xep loai: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Xep loai: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Xep loai: C");
        } else if (score >= 50 && score < 70) {
            System.out.println("Xep loai: D");
        } else if (score >= 0 && score < 50) {
            System.out.println("Xep loai: F");
        } else {
            System.out.println("Diem khong hop le. Vui long nhap diem trong khoang tu 0 den 100.");
        }

        scanner.close();
    }
}