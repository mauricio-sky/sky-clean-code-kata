package uk.sky.kata.cleancode.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Example5 {

    public static void main(String[] args) {

        // Bad: Handling different exceptions together
        try {
            readFile();
            executeSqlQuery();
        } catch (IOException | SQLException ex) {
            // we cannot get a specific message
        }
    }

    static void readFile() throws FileNotFoundException, IOException {
        throw new FileNotFoundException();
    }

    static void executeSqlQuery() throws SQLException {

    }
}
