import java.io.*;
import java.util.Scanner;

public class FileReadWriteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu từ bàn phím
        System.out.print("Nhap mot chuoi ki tu: ");
        String text = scanner.nextLine();

        System.out.print("Nhap mot ki tu: ");
        char character = scanner.next().charAt(0);

        System.out.print("Nhap mot so nguyen: ");
        int integer = scanner.nextInt();

        System.out.print("Nhap mot so thuc: ");
        double realNumber = scanner.nextDouble();

        String fileName = "exp.txt";

        // Ghi dữ liệu vào file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Chuoi ki tu: " + text + "\n");
            writer.write("Ki tu: " + character + "\n");
            writer.write("So nguyen: " + integer + "\n");
            writer.write("So thuc: " + realNumber + "\n");
            System.out.println("Du lieu da duoc ghi vao file " + fileName);
        } catch (IOException e) {
            System.err.println("Loi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file và hiển thị ra màn hình
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nNoi dung trong file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Loi khi đoc file: " + e.getMessage());
        }
    }
}
