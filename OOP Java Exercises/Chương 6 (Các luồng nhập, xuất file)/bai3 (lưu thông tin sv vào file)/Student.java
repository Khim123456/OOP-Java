import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Lớp Student
class Student implements Serializable {
    private String code;   // Mã sinh viên
    private String name;   // Tên sinh viên
    private String dob;    // Ngày, tháng, năm sinh
    private String gender; // Giới tính

    // Constructor không đối số
    public Student() {
    }

    // Constructor đầy đủ đối số
    public Student(String code, String name, String dob, String gender) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    // Phương thức toString trả về thông tin sinh viên
    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
