package OOPS;

class strong extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}

public class SetPriority {
    public static void main(String args[]) {
        strong t1 = new strong();
        strong t2 = new strong();
        strong t3 = new strong();

        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t1.setPriority(2); // valid priority value
        t2.setPriority(6); // valid priority value
        t3.setPriority(Thread.MAX_PRIORITY); // highest priority

        t1.start();
        t2.start();
        t3.start();
    }
}