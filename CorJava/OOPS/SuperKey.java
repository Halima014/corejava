package OOPS;

class Super {
    int a = 10;
}

class z extends Super {
    int a = 20;

    void show() {
        System.out.println(a);        // Prints the subclass's `a`
        System.out.println(super.a);  // Prints the superclass's `a`
    }
}

public class SuperKey {
    public static void main(String args[]) {
        z r = new z();
        r.show();
    }
}