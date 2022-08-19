package uk.sky.kata.cleancode.methods.refactoring;

public class TooManyParameters2 {

    public static void main(String[] args) {
        var person = new Person("Mr ", "John", "Smith");
        new EmailSender().send(person, "title", "emailBody");
    }
}

class EmailSender {

    public void send(Person person, String emailTitle, String emailBody) {
    }
}

class Person {

    private String title;
    private String name;
    private String surname;

    public Person(String title, String name, String surname) {
        this.title = title;
        this.name = name;
        this.surname = surname;
    }
}