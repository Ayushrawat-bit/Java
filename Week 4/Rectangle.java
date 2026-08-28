public class Rectangle {

    private double width;
    private double height;
    public Rectangle() {
        this(1, 1); 
        System.out.println("No-arg constructor called");
    }
    public Rectangle(double side) {
        this(side, side); 
        System.out.println("One-arg constructor called");
    }
    public Rectangle(double width, double height) {
        if (width <= 0) width = 1;
        if (height <= 0) height = 1;
        this.width = width;
        this.height = height;
        System.out.println("Two-arg constructor called");
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public boolean isSquare() {
        return width == height;
    }
    public void scale(double factor) {
        if (factor > 0) {
            width *= factor;
            height *= factor;
        }
    }
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height +
               ", area=" + getArea() + ", perimeter=" + getPerimeter() +
               ", square=" + isSquare() + "}";
    }
}
