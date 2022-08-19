package uk.sky.kata.cleancode.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Example7 {

    public static void main(String[] args) {

       try {
           int result = 1/0; // ArithmeticException
       } finally {
           cleanUp();
       }
    }

    static void cleanUp() {
        throw new IllegalStateException();
    }
}
