package OOPS;

import java.io.FileReader;
import java.io.IOException;
public class ReadAText 
{
	    private FileReader reader;

	    public ReadAText(String filePath) throws IOException {
	        this.reader = new FileReader(filePath);
	    }

	    public int read() throws IOException {
	        return reader.read();
	    }

	    public void close() throws IOException {
	        reader.close();
	    }

public static void main(String args[]) {
	        try {
	            ReadAText r = new ReadAText("C:/Users/lenovo/Desktop/C.txt");
	            try {
	                int i;
	                while ((i = r.read()) != -1) {
	                    System.out.print((char) i);
	                }
	            } finally {
	                r.close();
	                System.out.println("\nFile closed");
	            }
	        } catch (IOException e) {
	            System.out.println("Exception Handling: " + e.getMessage());
	        }
	    }
	}