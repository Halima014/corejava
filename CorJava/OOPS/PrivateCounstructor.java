package OOPS;

class Show {
    int a;
    double b;
    String c;

    public Show() { // made the constructor public
        a = 10;
        b = 30.56;
        c = "ankit";
        System.out.println(a + " " + b + " " + c);
    }

    public static void Show() { // made the method public
        // you can add implementation for this method if needed
    }
}

public class PrivateCounstructor {
    public static void main(String args[]) {
        Show r = new Show(); // now you can create an instance of Show
        // no Day class, so removed the line
    }
}