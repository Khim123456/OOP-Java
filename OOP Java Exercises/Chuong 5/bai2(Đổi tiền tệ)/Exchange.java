import java.util.ArrayList;

public class Exchange {
    private ArrayList<Rate> rates;

    public Exchange() {
        rates = new ArrayList<>();
        String[] MonArr = {
            "USD;VND;17000",
            "EUR;USD;1.2",
            "USD;IDN;15789",
            "USD;EUR;0.83",
            "CAD;IDN;16869"
        };

        for (String entry : MonArr) {
            String[] parts = entry.split(";");
            String code1 = parts[0];
            String code2 = parts[1];
            double rate = Double.parseDouble(parts[2]);
            rates.add(new Rate(code1, code2, rate));
        }
    }

    public double convert(String code1, String code2, double amount) {
        for (Rate rate : rates) {
            if (rate.getCode1().equalsIgnoreCase(code1) && rate.getCode2().equalsIgnoreCase(code2)) {
                return amount * rate.getRate();
            }
        }
        System.out.println("Khong tim thay ty gia chuyen doi cho " + code1 + " -> " + code2);
        return -1; // Trả về -1 nếu không tìm thấy tỷ giá
    }
}
