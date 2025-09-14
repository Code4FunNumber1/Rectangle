public class Rectangle {

    //    Initializing Variables
    private double length;
    private double width;
    private String id;
    private String units;

    //    Initializer Block
    {
        // Generate unique ID
        id = "RECT" + (int) (Math.random() * 9000 + 1000);

        // Set default units if not set by constructor
        if (units == null) {
            units = "units";
        }

        // Print creation message
        System.out.println("Rectangle " + id + " created");
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

    public double setWidth() {
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
        }
    }

    //    Calculation Methods
    public double calculateArea(String id) {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateDiagonal() {
        return Math.sqrt(((int) length ^ 2) + ((int) width ^ 2));
    }

    public boolean isSquare() {
        return Math.abs(length) == Math.abs(width);
    }

    //    Comparison Methods
    public boolean isLargerThan(Rectangle other) {
        return length > other.length && width > other.width;
    }

    public boolean isSameSize(Rectangle other) {
        return Math.abs(length) == Math.abs(other.length) && Math.abs(width) == Math.abs(other.width);
    }

    public String compareDimensions(Rectangle other) {
        if (calculateArea(id) == calculateArea(other.id)) {
            return id + " is equal to " + other.id;
        } else if (calculateArea(id) >= calculateArea(other.id)) {
            return id + " is greater than " + other.id;
        } else
            return id + " is less than " + other.id;
    }
}
