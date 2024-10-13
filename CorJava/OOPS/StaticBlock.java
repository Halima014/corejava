package OOPS;

import java.util.Stack;

public class StaticBlock {
    public static void main(String args[]) {
        StaticBlock r = new StaticBlock();
    }

    {
        System.out.println("plase Like");
    }

    static {
        System.out.println("Coding");
    }

    public StaticBlock() {
        System.out.println("plase share");
    }
}