package uk.sky.kata.cleancode.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Example4 {

    public static void main(String[] args) {

        // Bad: Handling different exceptions together
        try {
            readFile();
            executeSqlQuery();
        } catch (Exception ex) {
            // one exception to catch them all
        }
    }

    static void readFile() throws FileNotFoundException, IOException {

    }

    static void executeSqlQuery() throws SQLException {

    }
}
