package Collection;


import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> nameList = new LinkedList<String>();
        nameList.add("Ankit");
        nameList.add("anas");
        nameList.add("Altaf");

        for(String str : nameList) {
            System.out.println(str);
        }
    }
}