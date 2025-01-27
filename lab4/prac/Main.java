
import java.util.Scanner;

class Health {
    String name;
    double weight;
    double height;
    double BMI;
    
    Health(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.BMI = calculateBMI(weight, height);
    }

    private double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}

class Driver {
    Health[] people;

    Driver(int size) {
        people = new Health[size];
    }

    void save(int index, String name, double weight, double height) throws IndexOccupiedException {
        if (people[index] != null) {
            throw new IndexOccupiedException("Index " + index + " is already occupied.");
        }
        people[index] = new Health(name, weight, height);
    }
    
    void retrieve(int index) throws IndexException {
        if (index < 0 || index >= people.length) {
            throw new IndexException("Invalid index.");
        }
        if (people[index] == null) {
            System.out.println("No data available at index " + index);
        } else {
            Health person = people[index];
            System.out.println("Name: " + person.name);
            System.out.println("Weight: " + person.weight);
            System.out.println("Height: " + person.height);
            System.out.println("BMI: " + person.BMI);
        }
    }
}

class IndexOccupiedException extends Exception {
    IndexOccupiedException(String message) {
        super(message);
    }
}

class IndexException extends Exception {
    IndexException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int N = scanner.nextInt();
        try {
            if (N < 0) {
                throw new NegativeArraySizeException("Number of people cannot be negative.");
            }
            Driver driver = new Driver(N);
          
                System.out.println("Menu:");
                System.out.println("1. Add value in the array");
                System.out.println("2. Retrieve and print the information of specific user at index n");
                System.out.println("3. Exit");
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
                        } catch (IndexOccupiedException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Enter index to retrieve:");
                        int retrieveIndex = scanner.nextInt();
                        try {
                            driver.retrieve(retrieveIndex);
                        } catch (IndexException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter again.");
                }
            
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}