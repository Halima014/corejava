package OOPS;

final class Thief {
    void mNumber() {
        System.out.println("8945324521");
    }

    void atmPIN() {
        System.out.println("8944");
    }
}

// Removed the duplicate class 'thief'

public class FinalKey {
    public static void main(String args[]) {
        Thief t = new Thief();
        t.mNumber();
        t.atmPIN();
    }
}