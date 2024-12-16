import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SVCDCQ> danhSachSV = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien (2 <= n <= 4): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1));
            SVCDCQ sv = new SVCDCQ("", "", "", "", 0, 0, 0);
            sv.nhapThongTin();
            danhSachSV.add(sv);
        }

        // Hiển thị danh sách sinh viên
        System.out.println("\n===== Danh sach sinh vien =====");
        for (SVCDCQ sv : danhSachSV) {
            sv.inThongTin();
        }

        
        // Tìm kiếm sinh viên theo mã số
System.out.print("\nNhap ma so sinh vien can tim kiem: ");
String maSV = scanner.nextLine();
boolean found = false;
for (SVCDCQ sv : danhSachSV) {
    if (sv.getMaSV().equals(maSV)) { // So sánh theo mã sinh viên
        System.out.println("Thong tin sinh vien tim duoc:");
        sv.inThongTin();
        found = true;
        break;
    }
}
if (!found) {
    System.out.println("Khong ton tai sinh vien co ma vua nhap!");
}


        // Sắp xếp danh sách theo điểm trung bình giảm dần
        Collections.sort(danhSachSV, new Comparator<SVCDCQ>() {
            @Override
            public int compare(SVCDCQ sv1, SVCDCQ sv2) {
                return Double.compare(sv2.tinhDiem(), sv1.tinhDiem());
            }
        });

        System.out.println("\n===== Danh sach sinh vien sau khi sap xep =====");
        for (SVCDCQ sv : danhSachSV) {
            sv.inThongTin();
        }

        scanner.close();
    }
}
