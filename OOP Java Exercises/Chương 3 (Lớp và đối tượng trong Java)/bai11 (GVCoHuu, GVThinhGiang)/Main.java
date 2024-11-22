import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiangVien gv1 = new GVCoHuu();
        GiangVien gv2 = new GVThinhGiang();

        System.out.println("Nhap thong tin cho giang vien co huu:");
        gv1.nhapThongTin(scanner);
        System.out.println("Nhap thong tin cho giang vien thinh giang:");
        gv2.nhapThongTin(scanner);

        System.out.println("Thong tin giang vien:");
        gv1.inThongTin();
        System.out.println();
        gv2.inThongTin();
    }
}
    