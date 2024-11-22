import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập ngày, tháng, năm
            System.out.print("Nhap ngay: ");
            int ngay = scanner.nextInt();

            System.out.print("Nhap thang: ");
            int thang = scanner.nextInt();

            System.out.print("Nhap nam: ");
            int nam = scanner.nextInt();

            // Tạo đối tượng ThoiGian và kiểm tra tính hợp lệ
            ThoiGian thoiGian = new ThoiGian(ngay, thang, nam);
            System.out.println(thoiGian);

        } catch (InvalidDateException e) {
            // Hiển thị thông báo lỗi khi dữ liệu không hợp lệ
            System.out.println("Error! " + e.getMessage());
        } catch (Exception e) {
            // Xử lý các ngoại lệ khác
            System.out.println("Error! Da xay ra loi khong xac dinh!");
        } finally {
            // Đóng scanner
            scanner.close();
        }
    }
}