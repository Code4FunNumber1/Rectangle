public class RectangleDemo {
    public static void main(String[] args) {
        System.out.println("=== Rectangle Calculator Demo ===");

//        Rectangle Creation
        Rectangle rectangle = new Rectangle(5.0, 5.0, "μm");
        System.out.println("Rectangle " + rectangle.getId() + "created");

        Rectangle rectangle2 = new Rectangle(5.0, 5.0);
        System.out.println("Rectangle " + rectangle2.getId() + "created");

        Rectangle rectangle3 = new Rectangle(5.0, "Mm");
        System.out.println("Rectangle " + rectangle3.getId() + "created");

        Rectangle rectangle4 = new Rectangle();
        System.out.println("Rectangle " + rectangle4.getId() + "created");
        System.out.println();

//        Rectangle List
        System.out.println("Rectengle1: " + rectangle);
        System.out.println("Rectengle2: " + rectangle2);
        System.out.println("Rectengle3: " + rectangle3);
        System.out.println("Rectengle4: " + rectangle4);
        System.out.println();

//        Rectangle Calculation
        System.out.println("=== Calculation Tests ===");

        System.out.println("Rectangle " + rectangle.getId() + "(" + rectangle.getLength() + " x " + rectangle.getWidth() + "):");
        System.out.println(rectangle.getInfo());
        System.out.println();

        System.out.println("Rectangle " + rectangle2.getId() + "(" + rectangle2.getLength() + " x " + rectangle2.getWidth() + "):");
        System.out.println(rectangle2.getInfo());
        System.out.println();

        System.out.println("Rectangle " + rectangle3.getId() + "(" + rectangle3.getLength() + " x " + rectangle3.getWidth() + "):");
        System.out.println(rectangle3.getInfo());
        System.out.println();

        System.out.println("Rectangle " + rectangle4.getId() + "(" + rectangle4.getLength() + " x " + rectangle4.getWidth() + "):");
        System.out.println(rectangle4.getInfo());
        System.out.println();

//        Rectangle Comparison
        System.out.println("=== Comparison Tests ===");

        System.out.println("Is " + rectangle.getId() + " larger than " + rectangle2.getId() + "? " + rectangle.isLargerThan(rectangle2));
        System.out.println("Are " + rectangle.getId() + " and " + rectangle2.getId() + " the same size? " + rectangle.isSameSize(rectangle2));
        if (rectangle.isLargerThan(rectangle2)) {
            System.out.println("Dimension Comparison: " + rectangle.getId() + " is larger than " + rectangle2.getId());
        } else if (rectangle.isSameSize(rectangle2)) {
            System.out.println("Dimension Comparison: " + rectangle.getId() + " is the same size as " + rectangle2.getId());
        } else {
            System.out.println("Dimension Comparison: " + rectangle.getId() + " is Smaller than " + rectangle2.getId());
        }
        System.out.println();

//        Rectangle Scaling
        System.out.println("=== Scaling Tests ===");
        System.out.println("Original " + rectangle.getId() + ": " + rectangle.getWidth() + " x " + rectangle.getLength() + " " + rectangle.getUnits());
        rectangle.scale(2.0);
        System.out.println("After scaling by 2.0: " + rectangle.getId() + " x " + rectangle.getLength() + " " + rectangle.getUnits());
        System.out.println("New area: " + rectangle.calculateArea());
    }
}
