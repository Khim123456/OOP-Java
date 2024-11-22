public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (ngay <= 0 || ngay > 31) {
            throw new InvalidDateException("Ngay "+ ngay + " la khong hop le!");
        }
        if (thang <= 0 || thang > 12) {
            throw new InvalidDateException("Thang " + thang + " la khong hop le!");
        }
        if (nam <= 0) {
            throw new InvalidDateException("Nam " + nam + " la khong hop le!");
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "Thoi gian: " + ngay + "/" + thang + "/" + nam;
    }
}