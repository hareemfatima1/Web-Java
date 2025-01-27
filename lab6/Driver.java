import java.util.Scanner;

public class Driver {
     
    public static void main(String[] args) {
        try
        {
            Dictionary dictionary = new Dictionary();
            Scanner scanner = new Scanner(System.in);  
        while (true) {
            System.out.println("\nDictionary Application Menu:");
            System.out.println("1. Add Word");
    
            System.out.println("2. Search Word");
           
            System.out.println("3. Display all definitions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                   
                   dictionary.insertRecord();
                    break;
                case 2:
                    System.out.print("Enter word to search: ");
                    String wordTosearch = scanner.nextLine();
                    String result = dictionary.find(wordTosearch);
                    System.out.println(result);
                    break;
                
                case 3:
                    dictionary.displayAll();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.");
                }
            }
        }catch(Exception e)
        {
            System.out.println("Some exception occued");
        }
    }
}

