package uk.sky.kata.cleancode.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {

        // Good exception handling
        File file = new File("test.txt");
        try (FileInputStream inputStream = new FileInputStream(file)) {
            // read a file
        } catch (FileNotFoundException ex) {
            // log error
        } catch (IOException ex) {
            // log error
        }
    }
}
