public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;

    // Constructor không tham số
    public BenhNhan() {
    }

    // Constructor có tham số
    public BenhNhan(String ten, int tuoi, char gioiTinh, String tienSu, String chanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);  // Gọi constructor của lớp cha (Nguoi)
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }

    // Các setter
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    // Các getter
    public String getTienSu() {
        return tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    // Phương thức toString() để hiển thị thông tin
    @Override
    public String toString() {
        return super.toString() + ", Tiền sử: " + tienSu + ", Chẩn đoán: " + chanDoan + ", Bệnh viện: " + benhVien.toString();
    }
}
