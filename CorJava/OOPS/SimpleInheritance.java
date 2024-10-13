package OOPS;

import java.util.Scanner;

class Student {
    int roll, marks;
    String name;

    void input(Scanner scanner) {
        System.out.print("Enter roll: ");
        roll = scanner.nextInt();
        System.out.print("Enter name: ");
        name = scanner.next();
        System.out.print("Enter marks: ");
        marks = scanner.nextInt();
    }
}

class ankit extends Student {
    void Disp() {
        System.out.println(roll + " " + name + " " + marks);
    }
}

public class SimpleInheritance {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ankit r = new ankit();
        r.input(scanner);
        r.Disp();
    }
}