public class Rectangle {

    //    Initializing Variables
    private double length;
    private double width;
    private final String id;
    private String units;

    //    Initializer Block
    {
        int numId = (int) ((Math.random() * (9999 - 1000 + 1)) + 1000);
        id = "RECT" + numId;
    }

    //    Constructors
    public Rectangle(double length, double width, String units) {
        this.length = length;
        this.width = width;
        this.units = units;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, String units) {
        this.length = length;
        this.width = length;
        this.units = units;
    }

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    //    Getters and Setters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getId() {
        return id;
    }

    public String getUnits() {
        return units;
    }

    public void setLength(double length) {
        if (length > 0.0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0.0) {
            this.width = width;
        }
    }

    public void setUnits(String units) {
        if (units != null && !units.isEmpty()) {
            this.units = units;
        } else {
            System.out.println("Invalid units. Units shouldn't be empty or null");
            System.out.println("Units Not Set");
        }
    }

    //    Calculation Methods
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width,2));
    }

    public boolean isSquare() {
        return Math.abs(length) == Math.abs(width);
    }

    //    Comparison Methods
    public boolean isLargerThan(Rectangle other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();
        return thisArea > otherArea;
    }

    public boolean isSameSize(Rectangle other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();
        return thisArea == otherArea;
    }

//    Utility Methods
    public void scale(double factor) {
        length *= factor;
        width *= factor;
    }

    public String getInfo() {
        return "ID: " + id +
                "\nLength: " + length +
                "\nWidth: " + width +
                "\nUnits: " + units +
                "\nArea: " + calculateArea() +
                "\nPerimeter: " + calculatePerimeter();
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", length=" + length + ", id=" + id + ", units=" + units + "}";
    }
}
