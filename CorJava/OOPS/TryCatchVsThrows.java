package OOPS;

class Try{
    public static void printNumbersWithDelay() throws InterruptedException { 
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

public class TryCatchVsThrows {
    public static void main(String args[]) throws InterruptedException {
        try {
          //  Try.wait();
            
            System.out.println(10 / 2);
        } catch (Exception e) {
            System.out.println("Exception handling....!");
        }
        System.out.println("main method ended");
    }
}