public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;

    // Constructor mặc định
    public Nguoi() {}

    // Constructor có tham số
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    // Getter và Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "Ten: " + ten + ", Tuoi: " + tuoi + ", Gioi tinh: " + gioiTinh;
    }
}