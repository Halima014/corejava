package OOPS;

class Method {
    void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Method r = new Method();
        r.add(); // calls the no-arg add method
        r.add(100, 200); // calls the two-arg add method
        r.add(); // calls the no-arg add method again
        //r.add(); // this would also call the no-arg add method
    }
}