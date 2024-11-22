public class Test {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        
        System.out.println("Initial radius: " + resizableCircle.radius);
        System.out.println("Initial perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Initial area: " + resizableCircle.getArea());

        resizableCircle.resize(50); // Tăng kích thước lên 50%
        
        System.out.println("New radius after resizing: " + resizableCircle.radius);
        System.out.println("New perimeter: " + resizableCircle.getPerimeter());
        System.out.println("New area: " + resizableCircle.getArea());
    }
}