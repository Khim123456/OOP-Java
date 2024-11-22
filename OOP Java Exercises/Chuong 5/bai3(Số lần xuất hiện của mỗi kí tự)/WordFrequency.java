import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        // Mảng các chuỗi
        String[] lines = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };

        // Sử dụng HashMap để lưu từ và số lần xuất hiện
        HashMap<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;

        // Duyệt qua từng chuỗi trong mảng
        for (String line : lines) {
            // Tách các từ bằng khoảng trắng
            String[] words = line.split("\\s+");
            totalWords += words.length;

            // Đếm số lần xuất hiện của mỗi từ
            for (String word : words) {
                word = word.toLowerCase(); // Chuyển từ về chữ thường để không phân biệt hoa/thường
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Hiển thị số lần xuất hiện của từng từ
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        // Hiển thị tổng số từ
        System.out.print("Total words: ");
        System.out.print(totalWords);
    }
}
