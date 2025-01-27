public class Driver
{  
    public static void main (String args[]) 
    { 
 
        // create ReadFile objects by passing file names to them 
        // create and start multiple threads (at least two) 
        ReadFile r1 = new ReadFile("input1.txt");
        ReadFile r2 = new ReadFile("input2.txt");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
 
}
