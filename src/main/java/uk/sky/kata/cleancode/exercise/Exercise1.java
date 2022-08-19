package uk.sky.kata.cleancode.exercise;

public class Exercise1 {

    public boolean canBuyBeer(int age, int money) {
        if(age >= 21 && money >= 20) {
            return true;
        }
        return false;
    }
}
