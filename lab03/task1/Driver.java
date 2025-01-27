interface Shape 
{
    double CalculateArea();
    double CalculatePerimeter();
}

class Square implements Shape 
{
    private double length;
    private double width;

	 // Default constructor
    public Square() { }

    public Square(double length) 
	{
        	this.length = length;
        	this.width = length;
    	}

	 // Copy constructor

    	public Square(Square square) 
	{
        	this.length = square.length;
        	this.width = square.width;
    	}

	public void setLength(double length) 
	{
        	this.length = length;
    	}

    	public double getLength() 
	{
        	return length;
    	}
   
    	public double CalculateArea() 
	{
        	return length * width;
    	}

   	public double CalculatePerimeter() 
	{
        	return 4 * length;
    	}

   
    	@Override
    	public String toString() 
	{
        	
        	return String.format("Square - Area: %.2f, Perimeter: %.2f", CalculateArea(), CalculatePerimeter());
    	}
}

class Rectangle implements Shape 
{
    private double length;
    private double width;

	
    public Rectangle() { }

    public Rectangle(double length, double width) 
	{
        	this.length = length;
        	this.width = width;
    	}

	// Copy constructor

    	public Rectangle(Rectangle rectangle) 
	{
        	this.length = rectangle.length;
        	this.width = rectangle.width;
    	}

	public void setLength(double length) 
	{
        	this.length = length;
    	}

    	public double getLength() 
	{
        	return length;
    	}

    	public void setWidth(double width) 
	{
        	this.width = width;
    	}

    	public double getWidth() 
	{
        	return width;
    	}
   
    	public double CalculateArea() 
	{
        	return length * width;
    	}

    	public double CalculatePerimeter() 
	{
        	return 2 * (length + width);
    	}

  
    	 @Override
    	public String toString() 
	{
        	return String.format("Rectangle - Area: %.2f, Perimeter: %.2f", CalculateArea(), CalculatePerimeter());
    	}
}

class Circle implements Shape 
{
    private final double PI = 3.14;
    private double radius;

	 public Circle() { }

    	public Circle(double radius) 
	{
        	this.radius = radius;
    	}

	 // Copy constructor
    	public Circle(Circle circle) 
	{
        	this.radius = circle.radius;
    	}

	 public void setRadius(double radius) 
	{
        	this.radius = radius;
    	}

    	public double getRadius() 
	{
        	return radius;
    	}
    
    	public double CalculateArea() 
	{
        	return PI * radius * radius;
    	}

    	public double CalculatePerimeter() 
	{
        	return 2 * PI * radius;
    	}

    
    	 @Override
    	public String toString() 
	{
        	return String.format("Circle - Area: %.2f, Perimeter: %.2f", CalculateArea(), CalculatePerimeter());
    	}
}

public class Driver 
{
    	public static void main(String[] args)
	{

        	Shape[] shapes = new Shape[3];
        
        	
        	shapes[0] = new Square(5);
        	shapes[1] = new Rectangle(4, 6);
        	shapes[2] = new Circle(3);

       for (int i = 0; i < shapes.length; i++) 
	{
    		System.out.println(shapes[i]);
	}

    }
}
