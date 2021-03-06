public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x)*(this.x - x) +
                         (this.y - y)*(this.y - y));
    }

    public double distance(Point p) {
        return Math.sqrt((x - p.getX())*(x - p.getX()) +
                         (y - p.getY())*(y - p.getY()));
    }
}
