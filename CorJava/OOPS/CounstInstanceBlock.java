package OOPS;

class Final {
    int a, b;

    static void show() {
        System.out.println("learn java");
    }

    {
        a = 30;
        b = 40;
        System.out.println(a + " " + b);
    }

    public Final() {
        a = 10;
        b = 20;
        System.out.println(a + " " + b);
    }
}

public class CounstInstanceBlock {
    public static void main(String args[]) {
        Final.show();
        Final r = new Final();
        // r.show(); // not needed, as show() is static
    }
}