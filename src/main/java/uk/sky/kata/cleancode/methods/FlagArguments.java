package uk.sky.kata.cleancode.methods;

public class FlagArguments {

    public static void main(String[] args) {
        var room = new Room();
        switchLights(room, true);
    }



    static void switchLights(Room room, boolean on) {
        if (on) {
            // do something
        } else {
            // do something
        }
    }
}

class Room {
}
