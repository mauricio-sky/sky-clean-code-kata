package uk.sky.kata.cleancode.intro;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import static java.time.Instant.now;

public class Example1 {

    public void example1_1() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(13, 60);
        new AlarmClock().ring(c.getTime());
    }

    public void example1_2() {
        Instant snoozeTime = now().plusSeconds(60);
        ringAfter(snoozeTime);
    }

    private void ringAfter(Instant instant) {
        new AlarmClock().ring(Date.from(instant));
    }
}

class AlarmClock {

    void ring(Date date) {

    }
}
