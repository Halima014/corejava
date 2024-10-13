package OOPS;

class Bank extends Thread {
    static int bal = 5000;
    private int withdrawAmount;

    Bank(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public synchronized void withdraw() {
        String name = Thread.currentThread().getName();
        if (withdrawAmount <= bal) {
            System.out.println(name + " withdraws money");
            bal = bal - withdrawAmount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void run() {
        withdraw();
    }
}

public class StaticSynchronized {
    public static void main(String args[]) {
        Bank obj1 = new Bank(2000);
        Bank obj2 = new Bank(3000);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("Raju");
        t2.setName("Sunita");

        t1.start();
        t2.start();
    }
} 