import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng lao động phổ thông và kỹ sư
        NguoiLaoDong laoDong1 = new LaoDongPhoThong();
        NguoiLaoDong laoDong2 = new KiSu();

        // Nhập thông tin cho lao động phổ thông
        System.out.println("Nhap thong tin cho lao dong pho thong:");
        laoDong1.nhapThongTin(scanner);

        // Nhập thông tin cho kỹ sư
        System.out.println("Nhap thong tin cho ki su:");
        laoDong2.nhapThongTin(scanner);

        // In thông tin lao động phổ thông
        System.out.println("\nThong tin lao dong pho thong:");
        laoDong1.inThongTin();

        // In thông tin kỹ sư
        System.out.println("\nThong tin ki su:");
        laoDong2.inThongTin();
    }
}