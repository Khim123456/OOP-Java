public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Cac so co 3 chu so thoa man abc = a^3 + b^3 + c^3 la:");

        // Duyệt qua tất cả các số có 3 chữ số
        for (int number = 100; number <= 999; number++) {
            // Tách các chữ số a, b, c
            int a = number / 100;          // Hàng trăm
            int b = (number / 10) % 10;    // Hàng chục
            int c = number % 10;           // Hàng đơn vị

            // Kiểm tra điều kiện
            if (number == (a * a * a + b * b * b + c * c * c)) {
                System.out.println(number);
            }
        }
    }
}