import java.util.Scanner;

interface TwoDimensionalShape
{
	abstract double getArea();

}

class Circle implements TwoDimensionalShape
{
	private double radius;
	final private double PI = 3.14;

	Circle(){ }
	
	Circle(double radius){this.radius = radius;}

	@Override
	public double getArea()
	{
		return PI*(radius * radius);
	}

	

}

class Square implements TwoDimensionalShape
{
	private double length;

	Square(){}

	
	Square(double length){this.length = length;}

	@Override
	public double getArea()
	{
		return length * length;
	}

	

}

class Triangle implements TwoDimensionalShape
{
	private double height;
	private double base;

	Triangle(){}

	Triangle(double base, double height)
	{ 
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea()
	{
		return (0.5)*(base * height);
	}

	
}


public class Driver 
{
    	public static void main(String[] args)
	{
		
        	TwoDimensionalShape[] shapes = new TwoDimensionalShape[3];
        	Scanner sc = new Scanner(System.in);
		
        	double rad , len , base , height;

		System.out.print("Enter radius of Circle: ");
		rad = sc.nextDouble();
		System.out.print("Enter length of side of Square: ");
		len = sc.nextDouble();
		System.out.print("Enter base of Triangle: ");
		base = sc.nextDouble();
		System.out.print("Enter height of Triangle: ");
		height = sc.nextDouble();

        	shapes[0] = new Square(len);
        	shapes[1] = new Triangle(base, height);
        	shapes[2] = new Circle(rad);

       for (int i = 0; i < shapes.length; i++) 
	{
		if(shapes[i] instanceof Square)
		{	
			System.out.println("Is A square");
			
		}
		else if(shapes[i] instanceof Circle)
		{
			System.out.println("Is A Circle");
			
		}
		else if(shapes[i] instanceof Triangle)
		{
			System.out.println("Is A Triangle");
		}
		System.out.println("AREA: ");
    		System.out.println(shapes[i].getArea());
	}

    }
}


