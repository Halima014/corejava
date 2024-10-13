package OOPS;

class Cover {
    public Cover show() {
        System.out.println("learn coding");
        return this;
    }
}

class The extends Cover {
    public The show() {
        super.show();
        System.out.println("Please Like");
        return this;
    }
}

public class Covariant {
    public static void main(String args[]) {
        The t = new The();
        t.show();
    }
}