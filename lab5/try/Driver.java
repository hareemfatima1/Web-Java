
import java.util.Scanner;


class Health
{
	String name;
	double weight , height , BMI;
	
	Health(){  }

	Health(String name, double weight, double height)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		BMI = calculateBMI(weight, height);
	}

	private double calculateBMI(double weight, double height) 
	{
        	return weight / (height * height);
    	}

}

class NegativeArraySizeException extends Exception
{
	
	public String toString()
    {
        return "Can`t enter negative size.Number of people cannot be negative";
    }
}

class indexOccupiedException extends Exception
{
	
	public String toString()
    {
        return "Can`t enter index already occupied";
    }
}		

class indexException extends Exception
{
	
	public String toString()
    {
        return "Invalid Index";
    }
}

class Driver {
    Health people[];
	
	Driver(int size)
	{  
		people = new Health[size];
	}

    void save(int index, String name, double weight, double height) throws indexOccupiedException {
        if (people[index] != null) {
            throw new indexOccupiedException();
        }
        people[index] = new Health(name, weight, height);
    }

    void retrieve(int index) throws indexException {
        if (index < 0 || index >= people.length) {
            throw new indexException();
        }
        if (people[index] == null) {
            System.out.println("No data available at index " + index);
        } 
	else {
           
            System.out.println("Name: " + people[index].name);
            System.out.println("Weight: " + people[index].weight);
            System.out.println("Height: " + people[index].height);
            System.out.println("BMI: " + people[index].BMI);
        }
    }

	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter the number of people: ");
        	int N = scanner.nextInt();
        	try{ 
			if (N < 0) 
			{
                		throw new NegativeArraySizeException();
            		}
		Driver driver = new Driver(N);
		
                System.out.println("Menu:");
                System.out.println("1. Add value in the array");
                System.out.println("2. Retrieve and print the information of specific user at index n");
                System.out.println("3. Exit");

               
                
	while(true){
		 System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter index, name, weight, and height:");
                        int index = scanner.nextInt();
                        String name = scanner.next();
                        double weight = scanner.nextDouble();
                        double height = scanner.nextDouble();
                        try {
                            	driver.save(index, name, weight, height);
                        } catch (indexOccupiedException e) {
                            System.out.println(e);
                        }
                        break;
                    case 2:
                        System.out.println("Enter index to retrieve:");
                        int retrieveIndex = scanner.nextInt();
                        try {
                            	driver.retrieve(retrieveIndex);
                        } 
			catch (indexException e) 
			{
                            System.out.println(e);
                        }
                        break;
                    case 3:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter again.");
			
                }
		
	}}catch(NegativeArraySizeException e)
	{    System.out.println(e); }
	
            }
        } 
  





