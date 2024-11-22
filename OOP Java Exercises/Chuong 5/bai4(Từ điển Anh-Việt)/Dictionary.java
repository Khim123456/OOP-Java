import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    private HashMap<String, String> dictionary;

    // Constructor để khởi tạo từ điển
    public Dictionary() {
        dictionary = new HashMap<>();
        String[] entries = {
            "apple: qua tao",
            "ball: qua bong",
            "cat: con meo",
            "dog: con cho",
            "elephant: con voi",
            "fish: con ca",
            "gift: mon qua",
            "home: nha"
        };

        // Thêm dữ liệu từ mảng vào HashMap
        for (String entry : entries) {
            String[] parts = entry.split(": ");
            String englishWord = parts[0].trim();
            String vietnameseMeaning = parts[1].trim();
            dictionary.put(englishWord, vietnameseMeaning);
        }
    }

    // Phương thức lookup để tra từ
    public String lookup(String word) {
        return dictionary.getOrDefault(word.toLowerCase(), "khong tim thay");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        while (true) {
            System.out.print("Moi nhap tu can tra: ");
            String word = scanner.nextLine();

            // Thoát nếu người dùng nhập chuỗi rỗng
            if (word.isEmpty()) {
                System.out.println("Thoat chuong trinh!");
                break;
            }

            // Tra từ và hiển thị kết quả
            String meaning = dict.lookup(word);
            System.out.println("Nghia cua tu la: " + meaning);
        }

        scanner.close();
    }
}
