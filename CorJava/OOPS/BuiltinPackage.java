package OOPS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BuiltinPackage {

    public static void main(String args[]) {
        try {
            File f = new File("C:/Users/lenovo/Desktop/Lc.txt");
      Scanner sc=new Scanner(f);
      
       while (sc.hasNextLine())
       {
    	   System.out.println(sc.hasNextLine());
    	   System.out.println(sc.nextLine()); 
    	   System.out.println(sc.hasNextLine()); 
       }
    } 
        catch (IOException e) 
        {
            System.out.println("Exception Handling...!");
        }
    }
}
