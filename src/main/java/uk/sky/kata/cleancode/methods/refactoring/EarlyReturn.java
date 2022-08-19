package uk.sky.kata.cleancode.methods.refactoring;

public class EarlyReturn {

    private boolean systemIsUp;

    public String getPersonalInfo(Person person, int pin) {
        if (systemIsUp)
            return "System is down at the moment";

        if (person == null)
            return "person is invalid";

        if (person != null && person.getName().equals(""))
            return "invalid name";

        if (person.getPin() != pin)
            return "invalid pin";

        return person.getPersonalInfo();
    }

    class Person {

        private String name;
        private int pin;
        private String personalInfo;

        public String getName() {
            return name;
        }

        public int getPin() {
            return pin;
        }

        public String getPersonalInfo() {
            return personalInfo;
        }
    }
}


