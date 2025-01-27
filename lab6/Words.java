import java.io.*;
import java.util.*;

public class Words
{
    String word_name;
    String word_meaning;

    public Words()
    {

    }
    public Words(String word_name, String word_meaning) 
    {
        this.word_name = word_name;
        this.word_meaning = word_meaning;
    }
    public String getWord_name() 
    {
        return word_name;
    }
    public void setWord_name(String word_name) 
    {
        this.word_name = word_name;
    }
    public String getWord_meaning() 
    {
        return word_meaning;
    }
    public void setWord_meaning(String word_meaning) 
    {
        this.word_meaning = word_meaning;
    }
    
}