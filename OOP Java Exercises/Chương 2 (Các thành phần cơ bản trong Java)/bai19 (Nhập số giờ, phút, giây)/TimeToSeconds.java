import java.util.Scanner;

public class TimeToSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số giờ, phút và giây
        System.out.print("Nhap so gio: ");
        int hours = scanner.nextInt();
        System.out.print("Nhap so phut: ");
        int minutes = scanner.nextInt();
        System.out.print("Nhap so giay: ");
        int seconds = scanner.nextInt();

        // Tính tổng số giây
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Hiển thị kết quả
        System.out.println("Tong so giay la: " + totalSeconds);

        scanner.close();
    }
}