package OOPS;

import java.io.File;
import java.io.IOException;

public class DisplayTheFile {
    public static void main(String args[]) {
        try {
            File f = new File("C:/Users/lenovo/Desktop/Lc.txt");
            if (f.exists()) {
                System.out.println("File Name: " + f.getName());
                System.out.println("File Location: " + f.getAbsolutePath());
                System.out.println("File writable: " + f.canWrite());
                System.out.println("File Readable: " + f.canRead());
                System.out.println("File size: " + f.length());
            } else {
                System.out.println("File doesn't Exist...!");
                if (f.createNewFile()) {
                    System.out.println("File created successfully!");
                } else {
                    System.out.println("Failed to create file!");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}