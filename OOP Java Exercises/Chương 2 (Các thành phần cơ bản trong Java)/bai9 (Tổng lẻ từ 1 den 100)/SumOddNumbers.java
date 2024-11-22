public class SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Duyệt qua các số từ 1 đến 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Kiểm tra số lẻ
                sum += i;     // Cộng số lẻ vào tổng
            }
        }

        // Hiển thị kết quả
        System.out.println("Tong cac so le tu 1 den 100 la: " + sum);
    }
}