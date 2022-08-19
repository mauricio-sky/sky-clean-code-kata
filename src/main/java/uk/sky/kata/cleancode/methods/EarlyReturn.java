package uk.sky.kata.cleancode.methods;

public class EarlyReturn {

    private boolean systemIsUp;

    public String getPersonalInfo(Person person, int pin) {
        if (systemIsUp) {
            if (person != null && person.getName().equals("")) {
                if (person.getPin() != pin) {
                    return "invalid pin";
                }
                return "invalid name";
            }
            return "System is down at the moment";
        }

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


