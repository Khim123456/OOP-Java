public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;

    // Constructor không tham số
    public BenhVien() {
    }

    // Constructor có tham số
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    // Các setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    // Các getter
    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    // Phương thức toString() để hiển thị thông tin
    @Override
    public String toString() {
        return "Tên Bệnh Viện: " + ten + ", Địa chỉ: " + diaChi + ", Giám đốc: " + giamDoc;
    }
}