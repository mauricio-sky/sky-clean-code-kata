package uk.sky.kata.cleancode.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {

    public static void main(String[] args) {
        String yyyymmdstr = new SimpleDateFormat("YYYY/MM/DD").format(new Date());
    }
}