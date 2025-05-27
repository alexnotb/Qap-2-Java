/**
 * MyLine class represents a line segment with begin and end points.
 */
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor with MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor with coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getters and setters
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Get begin x-coordinate
    public int getBeginX() {
        return begin.getX();
    }

    // Set begin x-coordinate
    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Get begin y-coordinate
    public int getBeginY() {
        return begin.getY();
    }

    // Set begin y-coordinate
    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Get end x-coordinate
    public int getEndX() {
        return end.getX();
    }

    // Set end x-coordinate
    public void setEndX(int x) {
        end.setX(x);
    }

    // Get end y-coordinate
    public int getEndY() {
        return end.getY();
    }

    // Set end y-coordinate
    public void setEndY(int y) {
        end.setY(y);
    }

    // Set begin coordinates
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Set end coordinates
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Calculate length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // Calculate gradient (angle in radians)
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // toString method
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}