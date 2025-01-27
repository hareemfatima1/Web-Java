import java.util.*;

public class Dictionary {
     private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
    }
    
    public void insertRecord() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter word to add: ");
        String wordToAdd = scanner.nextLine();
        System.out.print("Enter definition: ");
        String definition = scanner.nextLine();
        Words w = new Words(wordToAdd, definition);
        dictionary.put(w.getWord_name().toLowerCase(), w.getWord_meaning());
    }
    
    public String find(String word) {
        return dictionary.get(word.toLowerCase());
    }
    
    public void displayAll()
    {
        System.out.println(dictionary);
    }

}
