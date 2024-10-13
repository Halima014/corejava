package OOPS;

class Allow {
    int a; 
    double b; 
    String c;

    // Private constructor
    private Allow() {
        a = 100; 
        b = 45.32;  
        c = "Coding";
    }

    // Constructor with one parameter
    Allow(int x) {
        a = x;
    }

    // Constructor with two parameters
    Allow(double y, String z) {
        b = y; 
        c = z;
    }

    // Method to create an instance of Allow with default constructor
    public static Allow createDefault() {
        return new Allow();
    }
}

public class CounstOverloding {
    public static void main(String args[]) {
        Allow r = Allow.createDefault(); // Accessing private constructor through a static method
        Allow r2 = new Allow(10);
        Allow r3 = new Allow(23.89, "arham");

        System.out.println(r.a + " " + r.b + " " + r.c);
        System.out.println(r2.a);
        System.out.println(r3.b + " " + r3.c);
    }
}