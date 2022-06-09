package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excep {

    public static void main(String[] args) {
        //execute(null);
        readerFile();
    }

    static void execute(String name){
        callMe(name);
    }

    static void callMe(String name){
        try {
            System.out.println(name.toUpperCase());
        } catch (Exception e) {
            System.out.println("File not found");
            throw new RuntimeException(e);

        }
    }

    static void readerFile(){
        try {
            FileReader reader = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            throw new RuntimeException(e);
        }

        finally {
            System.out.println("No matter what, this get executed");
        }
    }
}
