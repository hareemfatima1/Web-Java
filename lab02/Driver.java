import java.util.Scanner;
class Student
{
	private int rollNo;
	private String name;
	private String email;
	private String address;

	Student(){ }    //default

	// Parameterized constructor

    	public Student(int rollNo, String name, String email, String address) 
	{
        	this.rollNo = rollNo;
        	this.name = name;
        	this.email = email;
        	this.address = address;
    	}

    	// Copy constructor

    	public Student(Student other) 
	{
        	this.rollNo = other.rollNo;
        	this.name = other.name;
        	this.email = other.email;
        	this.address = other.address;
    	}

    	// Getters and setters

    	public int getRollNo() 
	{
        	return rollNo;
    	}

    	public void setRollNo(int rollNo) 
	{
        	this.rollNo = rollNo;
    	}

    	public String getName() 
	{
        	return name;
    	}

	public void setName(String name) 
	{
        	this.name = name;
    	}

    	public String getEmail() 
	{
        	return email;
    	}

    	public void setEmail(String email) 
	{
        	this.email = email;
    	}

    	public String getAddress() 
	{
        	return address;
    	}

	public void setAddress(String address) 
	{
        	this.address = address;
    	}

	// Method to input data for a student

    	public void inputData() 
	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter Roll No:");
        	rollNo = scanner.nextInt();
        	scanner.nextLine(); // Consume newline
        	System.out.println("Enter Name:");
        	name = scanner.nextLine();
        	System.out.println("Enter Email:");
        	email = scanner.nextLine();
        	System.out.println("Enter Address:");
        	address = scanner.nextLine();
    	}
	
	// Method to display data of a student

    	public void showData() 
	{
        	System.out.println("Roll No: " + rollNo);
        	System.out.println("Name: " + name);
        	System.out.println("Email: " + email);
        	System.out.println("Address: " + address);
    	}
	
}

public class Driver 
{
    public static void main(String[] args) 
	{
        	Student[] students = new Student[5];
        	
        // Input data for 5 students

        for (int i = 0; i < 5; i++) 
	{
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputData();
        }

        // Display data of all students

        System.out.println("\nDisplaying data for all students:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nDetails of Student " + (i + 1) + ":");
            students[i].showData();
        }
    }
}