import java.io.*;
import java.util.Scanner;

public class BinaryFileExample {
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

        String fileName = "exp.dat";

        // Ghi dữ liệu vào file nhị phân
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeUTF(text);          // Ghi chuỗi ký tự
            dos.writeChar(character);    // Ghi ký tự
            dos.writeInt(integer);       // Ghi số nguyên
            dos.writeDouble(realNumber); // Ghi số thực
            System.out.println("Du lieu da duoc ghi vao file file " + fileName);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file nhị phân
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\nDu lieu duoc doc tu file:");
            String readText = dis.readUTF();          // Đọc chuỗi ký tự
            char readCharacter = dis.readChar();     // Đọc ký tự
            int readInteger = dis.readInt();         // Đọc số nguyên
            double readRealNumber = dis.readDouble();// Đọc số thực

            // Hiển thị dữ liệu ra màn hình
            System.out.println("Chuoi ki tu: " + readText);
            System.out.println("Ki tu: " + readCharacter);
            System.out.println("So nguyen: " + readInteger);
            System.out.println("So thuc: " + readRealNumber);
        } catch (IOException e) {
            System.err.println("Loi khi doc file: " + e.getMessage());
        }
    }
}
