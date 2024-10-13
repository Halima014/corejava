package OOPS;

class think {
    void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            int c = a / b;
            System.out.println(c);
        }
    }
}

public class ThrowandThrows {
    public static void main(String args[]) {
        think t = new think();
        try {
            t.div(20, 2);
        } catch (ArithmeticException e) {
            System.out.println("The value of b is zero");
        }
    }
}