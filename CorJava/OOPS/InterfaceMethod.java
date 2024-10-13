package OOPS;

interface Card {
    void webdesign();
    void webdeveloper();
}

abstract class RajTech implements Card {
    @Override
    public void webdesign() {
        System.out.println("Green, Top menu,three dot button");
    }
}

class RahulTech extends RajTech {
    @Override
    public void webdeveloper() {
        System.out.println("HTML,CSS,javascript");
    }
}

public class InterfaceMethod {
    public static void main(String args[]) {
        RahulTech r = new RahulTech();
        r.webdesign();
        r.webdeveloper();
    }
}