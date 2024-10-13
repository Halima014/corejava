package OOPS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContent
{
 public static void main(String args[]) {
	  try 
	  {
	     FileInputStream f = new FileInputStream("C:/Users/lenovo/Desktop/Lc.txt");
	     FileOutputStream w = new FileOutputStream("C:/Users/lenovo/Desktop/Lc_copy.txt");

	       int i;
	      while ((i = f.read()) != -1) {
	         w.write(i);
	   }
	     System.out.println("Data Copied Successfully...!");
	        f.close();
	       w.close();
	    } 
	  catch (IOException e) 
	  {
	      System.out.println("Exception Handling: " + e.getMessage());
	        }
	    }
	}