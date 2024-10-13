package OOPS;

class Help extends Thread {
    public void run() {
        System.out.println("isAlive method program..!");
    }
}

public class IsAliveMethod {
    public static void main(String args[]) {
        Help t1 = new Help();
        Help t2 = new Help();

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t1.isAlive());
    }
}