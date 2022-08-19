package uk.sky.kata.cleancode.constructor;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class GregorianCalendarExample {


    public void test() {
        //new GregorianCalendar(new TimeZone(), new Locale());

        new GregorianCalendar(new TimeZone() {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }

            @Override
            public void setRawOffset(int offsetMillis) {

            }

            @Override
            public int getRawOffset() {
                return 0;
            }

            @Override
            public boolean useDaylightTime() {
                return false;
            }

            @Override
            public boolean inDaylightTime(Date date) {
                return false;
            }
        }, new Locale("", "", ""));

        // GregorianCalendar.getInstance();
    }


}
