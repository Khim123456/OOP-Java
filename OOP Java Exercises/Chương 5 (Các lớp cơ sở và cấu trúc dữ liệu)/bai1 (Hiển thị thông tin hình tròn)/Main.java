import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CircleCollection collection = new CircleCollection();
        Random random = new Random();

        // Tạo danh sách các hình tròn với bán kính ngẫu nhiên từ 1 đến 10
        for (int i = 0; i < 5; i++) {
            double radius = 1 + random.nextDouble() * 9; // Random bán kính từ 1 đến 10
            collection.addCircle(new Circle(radius));
        }

        // Hiển thị thông tin của các hình tròn
        System.out.println("Danh sach cac hinh tron: ");
        System.out.println(collection);

        // Tính tổng diện tích
        double totalArea = collection.calcSumArea();
        System.out.println("Tong dien tich cac hinh tron: " + totalArea);

        // Hiển thị diện tích lớn nhất
        double maxArea = collection.findMaxArea();
        System.out.println("Dien tich lon nhat: " + maxArea);

        // Hiển thị thông tin hình tròn có diện tích nhỏ nhất
        double minArea = collection.findMinArea();
        for (int i = 0; i < 5; i++) {
            if (collection.getCircle(i).getArea() == minArea) {
                System.out.println("Hinh tron co dien tich nho nhat:");
                System.out.println("Vi tri: " + i);
                System.out.println("Thong tin: " + collection.getCircle(i));
                break;
            }
        }
    }
}