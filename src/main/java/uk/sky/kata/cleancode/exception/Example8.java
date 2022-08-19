package uk.sky.kata.cleancode.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {

       try (Scanner scanner = new Scanner(new File(""))) {
           // read file
       } catch (FileNotFoundException ex) {
           // log error
       }
    }

}
