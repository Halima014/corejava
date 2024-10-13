package OOPS;

public class DefaultConstructor {
    static class Demo {
        int a;  
        String b;
        boolean c;

        // Default constructor to initialize instance variables
        Demo() {
            a = 0;
            b = "Default";
            c = false;
        }

        void Disp() {
            System.out.println(a + " " + b + " " + c);
        }
    }

    public static void main(String args[]) {
        Demo r = new Demo();
        r.Disp();
    }
}