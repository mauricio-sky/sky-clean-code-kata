package uk.sky.kata.cleancode.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Example3 {

    public static void main(String[] args) {

        // Bad: Handling different exceptions together
        try {
            readFile();
            executeSqlQuery();
        } catch (FileNotFoundException ex) {
            /// handle it
        } catch (IOException ex) {
            // handle it
        } catch (SQLException ex) {
            // handle it
        }
    }

    static void readFile() throws FileNotFoundException, IOException {

    }

    static void executeSqlQuery() throws SQLException {

    }
}
