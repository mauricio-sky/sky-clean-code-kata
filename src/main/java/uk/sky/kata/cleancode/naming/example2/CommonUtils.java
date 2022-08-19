package uk.sky.kata.cleancode.naming.example2;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Random;

public class CommonUtils {

    public static int countOccurrences(String stringToSeach, char charToFind) {
        int count = 0;
        for (int i = 0; i < stringToSeach.length(); i++) {
            if (stringToSeach.charAt(i) == charToFind) {
                count++;
            }
        }
        return count;
    }

    public static void printNowNewYorkTime() {
        var now = Instant.now().atZone(ZoneId.of("America/New_York")).toString();
        System.out.println(now);
    }

    public static int generateRandomNumberBetween(int low, int high) {
        return new Random().nextInt(high - low) + low;
    }
}
