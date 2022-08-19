package uk.sky.kata.cleancode.methods;

public class TooManyParameters2 {

    public static void main(String[] args) {
        new EmailSender().send("Mr ", "John", "Smith", "title", "emailBody");
    }
}

class EmailSender {

    public void send(String title, String name, String surname, String emailTitle, String emailBody) {}
}