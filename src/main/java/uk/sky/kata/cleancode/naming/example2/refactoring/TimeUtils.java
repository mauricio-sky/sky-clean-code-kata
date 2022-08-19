package uk.sky.kata.cleancode.naming.example2.refactoring;

import java.time.Instant;
import java.time.ZoneId;

public class TimeUtils {

    public static void printNowNewYorkTime() {
        var now = Instant.now().atZone(ZoneId.of("America/New_York")).toString();
        System.out.println(now);
    }
}
