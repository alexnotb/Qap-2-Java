/**
 * Test driver for MyLine class.
 */
public class TestMyLine {
    public static void main(String[] args) {
        // Test constructor with coordinates
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println("Line 1: " + line1);
        System.out.println("Length: " + line1.getLength()); // Should be 5.0
        System.out.println("Gradient: " + line1.getGradient());

        // Test constructor with MyPoint objects
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("\nLine 2: " + line2);
        System.out.println("Begin: " + line2.getBegin());
        System.out.println("End: " + line2.getEnd());
        System.out.println("Length: " + line2.getLength());

        // Test setters
        line2.setBeginX(2);
        line2.setBeginY(2);
        line2.setEndXY(5, 6);
        System.out.println("\nAfter modifying Line 2:");
        System.out.println("Line 2: " + line2);
        System.out.println("Begin X: " + line2.getBeginX());
        System.out.println("Begin Y: " + line2.getBeginY());
        System.out.println("End X: " + line2.getEndX());
        System.out.println("End Y: " + line2.getEndY());
    }
}