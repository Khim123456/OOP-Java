import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Lớp chính để chạy chương trình
public class StudentFileExample {
    public static void main(String[] args) {
        String fileName = "student.dat";

        // Tạo danh sách sinh viên
        List<Student> students = new ArrayList<>();
        students.add(new Student("SV001", "Nguyen Van A", "2000-01-01", "Male"));
        students.add(new Student("SV002", "Tran Thi B", "2001-02-02", "Female"));

        // Ghi danh sách sinh viên vào file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            System.out.println("Du lieu sinh vien da duoc ghi vao file " + fileName);
        } catch (IOException e) {
            System.err.println("Loi khi ghi file: " + e.getMessage());
        }

        // Đọc danh sách sinh viên từ file và hiển thị
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Student> readStudents = (List<Student>) ois.readObject();
            System.out.println("\nDu lieu sinh vien duoc doc tu file:");
            for (Student student : readStudents) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Loi khi doc file: " + e.getMessage());
        }
    }
}