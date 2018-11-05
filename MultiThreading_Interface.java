package multithreading;
private class EvenThread1 implements Runnable 
{ 
    public void run() 
    {        
        for(int j=0;j<1000000;j+=2)
        {
        	sleep(4000);
            System.out.println ("Even Thead ID:: " + 
                  Thread.currentThread().getId() + 
                  "Printing::"+j); 
        }
    } 
} 
private class OddThread1 implements Runnable
{ 
    public void run() 
    { 
        for(int j=1;j<1000000;j+=2)
        {
        	sleep(4000);
            System.out.println ("Odd Thead ID:: " + 
                  Thread.currentThread().getId() + 
                  "Printing::"+j);
        }
    } 
}  
 
public class MultiThreading_Interface {
    public static void main(String[] args) 
    { 
            Thread e1 = new Thread(new EvenThread1());          
            e1.start(); 
            Thread o1 = new Thread(new OddThread1());    
            e2.start();
            System.out.println("Main Thread is Exiting ....  Bye");
    } 
}
