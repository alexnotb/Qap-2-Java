/**
 * Test driver for MyRectangle class.
 */
public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructor with coordinates
        MyRectangle rect1 = new MyRectangle(1, 5, 4, 1);
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Test constructor with MyPoint objects
        MyPoint p1 = new MyPoint(0, 6);
        MyPoint p2 = new MyPoint(5, 2);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println("\nRectangle 2: " + rect2);
        System.out.println("Top-Left: " + rect2.getTopLeft());
        System.out.println("Bottom-Right: " + rect2.getBottomRight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        // Test setters
        rect2.setTopLeft(new MyPoint(1, 7));
        System.out.println("\nAfter modifying Rectangle 2:");
        System.out.println("Rectangle 2: " + rect2);
    }
}