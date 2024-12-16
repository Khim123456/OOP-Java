import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GiangVien> danhSach = new ArrayList<>();

        System.out.print("Nhap so giang vien: ");
        int n = scanner.nextInt();

        // Nhập thông tin giảng viên
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin giang vien thu " + (i + 1));
            System.out.println("1. Giang vien co huu");
            System.out.println("2. Giang vien thinh giang");
            int choice = scanner.nextInt();
            GiangVien gv;
            if (choice == 1) {
                gv = new GVCoHuu();
            } else {
                gv = new GVThinhGiangImpl();
            }
            gv.nhapThongTin();
            danhSach.add(gv);
        }

        // Hiển thị danh sách
        System.out.println("\nDanh sach giang vien:");
        for (GiangVien gv : danhSach) {
            gv.inThongTin();
        }

        // Sắp xếp theo lương giảm dần
        Collections.sort(danhSach, (a, b) -> Double.compare(b.tinhLuong(), a.tinhLuong()));
        System.out.println("\nDanh sach giang vien sau khi sap xep theo luong giam dan:");
        for (GiangVien gv : danhSach) {
            gv.inThongTin();
        }

        // Tìm kiếm giảng viên
        scanner.nextLine(); // Clear buffer
        System.out.print("\nNhap ho ten giang vien can tim: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (GiangVien gv : danhSach) {
            if (gv.hoTen.equalsIgnoreCase(searchName)) {
                System.out.println("Giang vien tim duoc:");
                gv.inThongTin();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay giang vien co ho ten: " + searchName);
        }
    }
}
