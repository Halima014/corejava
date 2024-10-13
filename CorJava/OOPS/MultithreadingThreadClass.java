package OOPS;

class h extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Aklish");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class MultithreadingThreadClass
{
    public static void main(String args[]) 
    {
        h t = new h();
        t.start();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ankit");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}