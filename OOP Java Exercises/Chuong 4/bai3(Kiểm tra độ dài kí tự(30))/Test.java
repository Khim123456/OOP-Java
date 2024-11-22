import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap cac chuoi ki tu (nhap 'DONE' de ket thuc):");

        while (true) {
            try {
                // Nhập chuỗi từ bàn phím
                System.out.print("Nhap chuoi: ");
                String input = scanner.nextLine();

                // Kết thúc khi gặp chuỗi "DONE"
                if (input.equalsIgnoreCase("DONE")) {
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                }

                // Kiểm tra độ dài của chuỗi
                if (input.length() > 30) {
                    throw new StringTooLongException("Chuoi qua dai: " + input.length() + " ki tu (gioi han 30 ki tu).");
                }

                // In chuỗi hợp lệ
                System.out.println("Chuoi '" + input + "' la hop le!");

            } catch (StringTooLongException e) {
                // Xử lý ngoại lệ khi chuỗi quá dài
                System.out.println("Error! " + e.getMessage());
                break; // Kết thúc chương trình nếu chuỗi quá dài
            } catch (Exception e) {
                // Xử lý các ngoại lệ khác (nếu có)
                System.out.println("Loi khong xac dinh: " + e.getMessage());
                break;
            }
        }

        scanner.close();
    }
}