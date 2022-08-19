package uk.sky.kata.cleancode.methods;

public class TernaryOperation {

    public static void main(String[] args) {

    }

    String getTitle(Person person) {
        if (person.getGender() == Gender.MALE)
            return "Mr.";

        return person.isMarried() ? "Mrs." : "Miss";
    }

    class Person {
        Gender gender;
        boolean isMarried;

        public Gender getGender() {
            return gender;
        }

        public boolean isMarried() {
            return isMarried;
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}