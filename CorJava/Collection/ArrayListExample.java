package Collection;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Ankit");
        nameList.add("anas");
        nameList.add("Altaf");

        System.out.println(nameList);
        nameList.add("Anish");
        System.out.println(nameList);
        nameList.add(1, "Rohit"); // correct add method call
        System.out.println(nameList);
        nameList.add(1, "Rahul"); // correct add method call
        System.out.println(nameList);
    }
}