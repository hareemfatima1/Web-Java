import java.io.*;  
public class ReadFile implements Runnable{ 
      String filename; 
       
      // param constructor  
public ReadFile(String fn) 
{  
    this.filename = fn;  
} 
 
// overriding run method 
// this method contains the code for file reading  
// Read and print data line by line with the fileName 
public void run ( ) 
{ 
  try
  {
    FileReader f1 = new FileReader(filename);
    BufferedReader b = new BufferedReader(f1);
    
    int count = 1;
    String line;
    while((line = b.readLine()) != null)
    {
        System.out.println(count + " " +line + " - from file " + filename);
        count++;
    }
    b.close();
    f1.close();
  }
  catch(IOException e)
  {
    System.out.println("Some exception occured");
    e.printStackTrace();
  }
 
} 
} // end of class 
 