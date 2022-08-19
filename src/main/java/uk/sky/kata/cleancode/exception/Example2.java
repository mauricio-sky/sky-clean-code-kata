package uk.sky.kata.cleancode.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example2 {

    public static void main(String[] args) {

        // Bad exception handling
        File file = new File("test.txt");
        try (FileInputStream inputStream = new FileInputStream(file)) {
            // read a file
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            // oops..
        }
    }
}
