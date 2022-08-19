package uk.sky.kata.cleancode.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Example6 {

    public static void main(String[] args) {

        // Bad: Handling different exceptions together and using instanceof
        try {
            readFile();
            executeSqlQuery();
        } catch (IOException | SQLException ex) {

            if (ex instanceof IOException) {
                // ...
            }

            if (ex instanceof SQLException) {
                // ..
            }
        }
    }

    static void readFile() throws FileNotFoundException, IOException {
        throw new FileNotFoundException();
    }

    static void executeSqlQuery() throws SQLException {

    }
}
