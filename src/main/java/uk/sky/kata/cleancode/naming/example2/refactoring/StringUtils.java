package uk.sky.kata.cleancode.naming.example2.refactoring;

public class StringUtils {

    public static int countOccurrences(String stringToSeach, char charToFind) {
        int count = 0;
        for (int i = 0; i < stringToSeach.length(); i++) {
            if (stringToSeach.charAt(i) == charToFind) {
                count++;
            }
        }
        return count;
    }
}
