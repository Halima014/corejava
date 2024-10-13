package OOPS;

interface A {
    void show();
}

interface B {
    void showB();  // Renamed for clarity
}

class MultipleInheritanceDemo implements A, B {
    public void show() {
        System.out.println("Interface A");
    }

    public void showB() {  // Renamed to match the interface method
        System.out.println("Interface B");
    }
}

public class MultipleIn {
    public static void main(String args[]) {
        MultipleInheritanceDemo t = new MultipleInheritanceDemo();
        t.show();
        t.showB();  // Use the renamed method
    }
}