public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Rectangle("Red", 5, 10);
        shapes[1] = new Triangle("Blue", 4, 7);
        shapes[2] = new Rectangle("Green", 6, 8);
        shapes[3] = new Triangle("Yellow", 3, 5);
        
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println(shape);
            }
        }
    }
}
