import java.util.Scanner;

public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private char gender;

    NhanVien() {
    }

    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua nhan vien: ");
        this.name = sc.nextLine();
        DiaChi diaChi = new DiaChi();
        diaChi.input();
        this.address = diaChi;
        System.out.println("Nhap thong tin ca nhan cua nhan vien:");
        System.out.print("Date of birth: ");
        this.dob = sc.nextLine();
        System.out.print("Gender: ");
        this.gender = sc.nextLine().charAt(0);
    }

    @Override
    public String toString() {
        return "Nhan Vien [name = " + name + ", address = " + address.toString() + ", dob = " + dob + ", gender = " + gender
                + "]";
    }

}