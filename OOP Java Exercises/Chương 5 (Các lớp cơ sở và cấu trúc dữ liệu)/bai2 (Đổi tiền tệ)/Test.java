import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exchange exchange = new Exchange();

        System.out.print("Moi nhap vao ma tien te thu nhat: ");
        String code1 = scanner.nextLine().toUpperCase();

        System.out.print("Moi nhap ma tien te thu 2: ");
        String code2 = scanner.nextLine().toUpperCase();

        System.out.print("Moi nhap luong tien can chuyen doi: ");
        double amount = scanner.nextDouble();

        double result = exchange.convert(code1, code2, amount);
        if (result != -1) {
            System.out.printf("Luong tien sau khi doi: %.2f%n", result);
        }
    }
}
