import java.util.Scanner;

public class EnglishScoreSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhap so luong sinh vien trong lop: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng điểm
        int[] scores = new int[n];

        // Nhập điểm thi tiếng Anh cho từng sinh viên
        System.out.println("Nhap diem thi tieng Anh cho tung sinh vien (thang diem 100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Diem cua sinh vien thu " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Nhập điểm cần tìm
        System.out.print("Nhap diem can tim: ");
        int targetScore = scanner.nextInt();

        // Tìm sinh viên có điểm bằng điểm cần tìm
        boolean found = false;
        System.out.println("Cac sinh vien co diem bang " + targetScore + ":");
        for (int i = 0; i < n; i++) {
            if (scores[i] == targetScore) {
                System.out.println("Sinh vien thu " + (i + 1) + " co diem " + targetScore);
                found = true;
            }
        }

        // Nếu không tìm thấy sinh viên nào
        if (!found) {
            System.out.println("Khong co sinh vien nao co diem = " + targetScore);
        }

        scanner.close();
    }
}