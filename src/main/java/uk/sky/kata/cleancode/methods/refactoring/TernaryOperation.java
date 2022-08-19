package uk.sky.kata.cleancode.methods.refactoring;

public class TernaryOperation {

    public static void main(String[] args) {

    }

    String getTitle(Person person) {
        return person.getGender() == Gender.MALE ? "Mr." : person.isMarried() ? "Mrs." : "Miss";
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