package OOPS;

import java.util.Scanner;

import java.util.Scanner;

interface Client {
    void input();
    void output();
}

class Raju implements Client {
    String name;
    double sal;

    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter UserName:");
        name = r.nextLine();

        System.out.println("Enter salary: ");
        sal = r.nextDouble();
        r.close(); 
    }

    public void output() {
        System.out.println(name + " " + sal);
    }
}

public class Interface {
    public static void main(String args[]) {
        Client c = new Raju();
        c.input();
        c.output();
    }
}