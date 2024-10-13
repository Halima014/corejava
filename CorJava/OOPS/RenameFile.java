package OOPS;

import java.io.File;

public class RenameFile 
{
 public static void main(String args[]) 
 {
	  File f = new File("C:/Users/lenovo/Desktop/Lc.txt");
	  File r = new File("C:/Users/lenovo/Desktop/Lc.txt");
	 if (f.exists()) 
	 {
	    System.out.println(f.renameTo(r));
	 }
 else 
 {
	 System.out.println("File doesn't Exist...!");
 }

	}
}
