package uk.sky.kata.cleancode.methods;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TooManyParameters {

    public static void main(String[] args) {
        long millisSinceEpoch = nowPlusTime(0, 0, 4);
        new Order().setExpirationDate(millisSinceEpoch);
    }

    private static long nowPlusTime(int months, int weeks, int days) {
        return LocalDateTime.now().plusMonths(months)
                .plusWeeks(weeks)
                .plusDays(days)
                .atZone(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }
}


class Order {

    void setExpirationDate(long expirationDate) {
        // code
    }
}