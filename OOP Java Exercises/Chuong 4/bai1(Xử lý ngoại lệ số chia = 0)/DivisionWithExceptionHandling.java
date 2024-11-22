import java.util.Scanner;

public class DivisionWithExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Nhập số nguyên thứ nhất
            System.out.print("Nhap so nguyen thu nhat: ");
            int soThuNhat = scanner.nextInt();
            
            // Nhập số nguyên thứ hai
            System.out.print("Nhap so nguyen thu 2: ");
            int soThuHai = scanner.nextInt();
            
            // Thực hiện phép chia
            int ketQua = soThuNhat / soThuHai;
            
            // Hiển thị kết quả
            System.out.println("Ket qua phep chia = " + ketQua);
        } catch (ArithmeticException e) {
            // Xử lý ngoại lệ khi số chia bằng 0
            System.out.println("Error. Khong the chia cho 0!");
        } catch (Exception e) {
            // Xử lý ngoại lệ khác (nếu có)
            System.out.println("Error. Loi khong xac dinh!");
        } finally {
            // Đóng scanner
            scanner.close();
        }
    }
}