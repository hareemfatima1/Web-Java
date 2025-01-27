import javax.swing.JOptionPane;

// Shape class
class Shape {
    private double area;
    private double volume;

    // Default constructor
    public Shape() {
    }

    // Parameterized constructor
    public Shape(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    // Copy constructor
    public Shape(Shape other) {
        this.area = other.area;
        this.volume = other.volume;
    }

    // Method to get input from the user using GUI components
    public void getInput() {
        String inputArea = JOptionPane.showInputDialog("Enter area:");
        area = Double.parseDouble(inputArea);

        String inputVolume = JOptionPane.showInputDialog("Enter volume:");
        volume = Double.parseDouble(inputVolume);
    }

    // Override toString() method to display data members
    @Override
	public String toString() 
	{
    		return String.format("Area: %.2f, Volume: %.2f", area, volume);
	}

}

// Square class extending Shape
class Square extends Shape {
    private double width;
    private double length;
    private double height;

    // Parameterized constructor
    public Square(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // Override getInput() method
    @Override
    public void getInput() {
        String inputWidth = JOptionPane.showInputDialog("Enter width:");
        width = Double.parseDouble(inputWidth);

        String inputLength = JOptionPane.showInputDialog("Enter length:");
        length = Double.parseDouble(inputLength);

        String inputHeight = JOptionPane.showInputDialog("Enter height:");
        height = Double.parseDouble(inputHeight);
    }

    // Override toString() method
    @Override
	public String toString()
	{
    		return String.format("%s%nWidth: %.2f%nLength: %.2f%nHeight: %.2f", super.toString(), width, length, height);
	}

}

// Sphere class extending Shape
class Sphere extends Shape {
    private double radius;
    private final double pi = 3.14;

    // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Override getInput() method
    @Override
    public void getInput() {
        String inputRadius = JOptionPane.showInputDialog("Enter radius:");
        radius = Double.parseDouble(inputRadius);
    }

    // Override toString() method
    @Override
	public String toString() 
	{
    		return String.format("%s%nRadius: %.2f%nPi: %.2f", super.toString(), radius, pi);
	}

}

// Driver class
public class Driver {
    public static void main(String[] args) {
        // Create objects and test functionality
        Shape shape1 = new Shape();
        shape1.getInput();
        System.out.println("Shape 1:\n" + shape1);

        Square square1 = new Square(5.0, 5.0, 5.0);
        square1.getInput();
        System.out.println("\nSquare 1:\n" + square1);

        Sphere sphere1 = new Sphere(3.0);
        sphere1.getInput();
        System.out.println("\nSphere 1:\n" + sphere1);
    }
}
