import java.util.ArrayList;

public class CircleCollection {
    private ArrayList<Circle> al;

    // Constructor
    public CircleCollection() {
        this.al = new ArrayList<>();
    }

    // Thêm một hình tròn vào danh sách
    public void addCircle(Circle c) {
        al.add(c);
    }

    // Lấy hình tròn tại vị trí pos
    public Circle getCircle(int pos) {
        if (pos >= 0 && pos < al.size()) {
            return al.get(pos);
        }
        return null;
    }

    // Thiết lập giá trị cho phần tử thứ pos
    public void setCircle(int pos, Circle c) {
        if (pos >= 0 && pos < al.size()) {
            al.set(pos, c);
        }
    }

    // Trả về thông tin của tất cả các hình tròn
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("CircleCollection: \n");
        for (int i = 0; i < al.size(); i++) {
            result.append("Index ").append(i).append(": ").append(al.get(i).toString()).append("\n");
        }
        return result.toString();
    }

    // Tính tổng diện tích
    public double calcSumArea() {
        double sum = 0;
        for (Circle c : al) {
            sum += c.getArea();
        }
        return sum;
    }

    // Tìm diện tích nhỏ nhất
    public double findMinArea() {
        if (al.isEmpty()) return 0;
        double minArea = al.get(0).getArea();
        for (Circle c : al) {
            if (c.getArea() < minArea) {
                minArea = c.getArea();
            }
        }
        return minArea;
    }

    // Tìm diện tích lớn nhất
    public double findMaxArea() {
        if (al.isEmpty()) return 0;
        double maxArea = al.get(0).getArea();
        for (Circle c : al) {
            if (c.getArea() > maxArea) {
                maxArea = c.getArea();
            }
        }
        return maxArea;
    }
}