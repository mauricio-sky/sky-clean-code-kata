package uk.sky.kata.cleancode.comment;

import java.util.ArrayList;
import java.util.List;

public class Useless1 {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // loops over a list of books   --> Is it going to help? Is it increasing the understanding? No!
        for (Book book : books) {
            // do something
        }
    }

    class Book {
    }
}
