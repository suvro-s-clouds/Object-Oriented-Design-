/**
 * Title: Java program demonstrating Open-Closed Principle (OCP)
 * Author: [Name - Suvro Dev Mojumder , Student ID - 220237 , Discipline - CSE , Khulna University ]
         extensibility and maintainability.
 */

/**
 * Abstract class representing a shape.
 */
abstract class Shape {
    /**
     * Calculates the area of the shape.
     *
     * @return The area of the shape.
     */
    abstract double calculateArea();
}

/**
 * Class representing a rectangle.
 */
class Rectangle extends Shape {
    private double width;
    private double height;

    /**
     * Constructs a rectangle with the given width and height.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    @Override
    double calculateArea() {
        return width * height;
    }
}

/**
 * Class representing a circle.
 */
class Circle extends Shape {
    private double radius;

    /**
     * Constructs a circle with the given radius.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return The area of the circle.
     */
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * Class representing an area calculator.
 * This class follows the Open-Closed Principle as it can be extended to support
 * new shapes by simply adding a new subclass of Shape and implementing its
 * calculateArea() method.
 */
class AreaCalculator {
    /**
     * Calculates the total area of an array of shapes.
     *
     * @param shapes Array of shapes.
     * @return Total area of all shapes.
     */
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

/**
 * Main class to demonstrate the usage of area calculator with OCP.
 */
public class ShapeDemo {
    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = new Shape[]{
                new Rectangle(5, 4),
                new Circle(3),
                // Add more shapes here without modifying existing code
        };

        // Create an instance of AreaCalculator
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate and display the total area of all shapes
        System.out.println("Total Area of Shapes: " + areaCalculator.calculateTotalArea(shapes));
    }
}
