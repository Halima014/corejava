package OOPS;

abstract class Animal {
    Animal() {
        System.out.println("All animals....!");
    }
    public abstract void sound();
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog is Barking");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion is Roar");
    }
}

public class AbstractClass {
    public static void main(String args[]) {
        Dog r = new Dog();
        Lion l = new Lion();
        r.sound();
        l.sound();
    }
}