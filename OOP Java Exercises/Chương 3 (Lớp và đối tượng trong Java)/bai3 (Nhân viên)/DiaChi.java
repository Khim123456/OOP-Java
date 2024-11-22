import java.util.Scanner;

public class DiaChi {
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;

    public DiaChi() {
    }

    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    public String getThon() {
        return thon;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void input() {
        System.out.println("Nhap dia chi cua nhan vien:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Thon: ");
        this.thon = sc.nextLine();
        System.out.print("Xa: ");
        this.xa = sc.nextLine();
        System.out.print("Huyen: ");
        this.huyen = sc.nextLine();
        System.out.print("Tinh: ");
        this.tinh = sc.nextLine();

    }

    @Override
    public String toString() {
        return "DiaChi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
    }

}