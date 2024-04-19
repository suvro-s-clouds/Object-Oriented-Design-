/**
 * Title: Java program demonstrating Liskov Substitution Principle (LSP)
 * Author: [Name - Suvro Dev Mojumder , Student ID - 220237 , Discipline - CSE , Khulna University ]

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
 * Class representing a square.
 */
class Square extends Shape {
    private double side;

    /**
     * Constructs a square with the given side length.
     *
     * @param side The side length of the square.
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of the square.
     *
     * @return The area of the square.
     */
    @Override
    double calculateArea() {
        return side * side;
    }
}

/**
 * Main class to demonstrate the usage of shapes with LSP.
 */
public class ShapeDemo {
    /**
     * The main entry point of the program.
     */
    public static void main(String[] args) {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(5, 4);
        // Calculate and display the area
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        // Create a square
        Square square = new Square(5);
        // Calculate and display the area
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
