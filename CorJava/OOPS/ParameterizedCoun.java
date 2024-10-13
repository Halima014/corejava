package OOPS; 

class done {
    int x, y;

    done(int a, int b) {
        x = a; 
        y = b;
    }
    done(int a, String b) {
        System.out.println(a + " " + b);
    }
    void show() {
        System.out.println(x + " " + y);
    }
}

public class ParameterizedCoun {
    public static void main(String args[]) {
        done r = new done(100, 200);        
        done t = new done(10, "java"); 
    }
}