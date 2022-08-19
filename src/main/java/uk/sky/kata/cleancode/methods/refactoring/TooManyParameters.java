package uk.sky.kata.cleancode.methods.refactoring;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static java.time.LocalDateTime.now;

public class TooManyParameters {

    public static void main(String[] args) {
        int months = 0;
        int weeks = 0;
        int days = 0;

        // before
        //long millisSinceEpoch = nowPlusTime(0, 0, 4);
        //new Order().setExpirationDate(millisSinceEpoch);

        // after
        new Order().setExpirationDate(nowPlusDays(4));
    }

    private static long nowPlusMonths(int months) {
        return withDefaultZone(now().plusMonths(months));
    }

    private static long nowPlusWeeks(int weeks) {
        return withDefaultZone(now().plusWeeks(weeks));
    }

    private static long nowPlusDays(int days) {
        return withDefaultZone(now().plusWeeks(days));
    }

    private static long withDefaultZone(LocalDateTime localDateTime) {
        return localDateTime.atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }
}

class Order {

    void setExpirationDate(long expirationDate) {
        // code
    }
}