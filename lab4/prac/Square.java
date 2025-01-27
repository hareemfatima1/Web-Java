
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

	@Override
    	public String toString() 
	{
        	
        	return String.format("Circle-Radius: %.2f \n Area:%.2f\n", radius , getArea());
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

	@Override
    	public String toString() 
	{
        	
        	return String.format("Square- length: %.2f \nSquare_Area: %.2f\n", length , getArea());
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

	@Override
    	public String toString() 
	{
        	
        	return String.format("Triangle-Base: %.2f \nTriangle_Height: %.2f \nTriangle_Area: %.2f\n", base , height , getArea());
    	}	

}


