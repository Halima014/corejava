package OOPS;

class tem extends Thread {
    public void run() {
        try {
            String n = Thread.currentThread().getName();
            for (int i = 1; i <= 3; i++) {
                System.out.println(n + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {
            System.out.println("Thread interrupted");
        }
    }
}

class sleepMethod {
    public static void main(String args[]) {
        tem t1 = new tem();
        tem t2 = new tem();
        tem t3 = new tem();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}