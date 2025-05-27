/**
 * MyRectangle class represents a rectangle with top-left and bottom-right points.
 */
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor with MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Constructor with coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Get width
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Get height
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Calculate area
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculate perimeter
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}