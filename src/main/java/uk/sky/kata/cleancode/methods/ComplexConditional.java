package uk.sky.kata.cleancode.methods;

import static java.time.LocalTime.now;

public class ComplexConditional {

    public static void main(String[] args) {
        int hour = getHourOfDay();
        if (hour > 6 && hour < 22) {
            // day time logic
        } else {
            // night time logic
        }
    }

    private static int getHourOfDay() {
        return now().getHour();
    }
}
