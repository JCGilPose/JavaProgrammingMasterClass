public class Wall {
    private double width;
    private double height;

    public Wall() {
        width = 0.0;
        height = 0.0;
    }

    public Wall(double width, double height) {
        if (width < 0.0) {
            this.width = 0.0;
        }
        else {
            this.width = width;
        }
        if (height < 0.0) {
            this.height = 0.0;
        }
        else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width < 0.0) {
            width = 0.0;
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if (height < 0.0) {
            height = 0.0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }
}
