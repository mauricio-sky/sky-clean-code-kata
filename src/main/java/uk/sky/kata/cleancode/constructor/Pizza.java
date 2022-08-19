package uk.sky.kata.cleancode.constructor;

public class Pizza {

    private int size;
    private boolean cheese;
    private boolean ham;
    private boolean mushroom;

    public Pizza(int size) {
        // ...
    }

    public Pizza(int size, boolean cheese) {
        // ...
    }

    public Pizza(int size, boolean cheese, boolean ham) {
        // ...
    }

    public Pizza(int size, boolean cheese, boolean ham, boolean mushroom) {
        // ...
    }


    public void instances() {
        Pizza cheesePizza = new Pizza(10, true);


        Pizza cheesePizza2 = new Builder(10)
                .cheese(true)
                .build();

    }

    static class Builder {

        private final int size;

        private boolean cheese;
        private boolean ham;
        private boolean mushroom;

        public Builder(int size) {
            this.size = size;
        }

        Builder cheese(boolean value) {
            cheese = value;
            return this;
        }

        Builder ham(boolean value) {
            ham = value;
            return this;
        }

        Builder mushroom(boolean value) {
            mushroom = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(size, cheese, ham, mushroom);
        }
    }
}
