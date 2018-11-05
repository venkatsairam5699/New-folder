package multithreading;
class EvenThread extends Thread 
{ 
    public void run() 
    {        
        for(int j=0;j<50;j+=2)
            System.out.println ("Even Thead ID:: " + 
                  Thread.currentThread().getId() + 
                  "Printing::"+j); 
    } 
} 
class OddThread extends Thread 
{ 
    public void run() 
    { 
        for(int j=1;j<50;j+=2)
            System.out.println ("Odd Thead ID:: " + 
                  Thread.currentThread().getId() + 
                  "Printing::"+j);
    } 
}  
public class MultiThreading 
{ 
    public static void main(String[] args) 
    {  
            EvenThread e = new EvenThread(); 
            
            OddThread o = new OddThread(); 
            o.start(); 
            e.
            e.start(); 
            System.out.println("Main Thread is Exiting ....  Bye");
    } 
}
