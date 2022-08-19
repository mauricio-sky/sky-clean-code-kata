package uk.sky.kata.cleancode.methods.refactoring;

public class FailFast {

    public static void main(String[] args) {
        int total = getTotalCompesation(0);
        System.out.println(total);
    }

    static int getTotalCompesation(int someBonus) {
        if (someBonus <= 0) {
            throw new IllegalArgumentException("variable can't be < 0");
        }

        int intermediateResult = getBaseSalary() * someBonus;
        int secondIntermediateResult = convertToLocalCurrency(intermediateResult);
        return getSomeOtherMetric() / secondIntermediateResult;
    }














































    private static int getBaseSalary() {
        return 3000;
    }

    private static int convertToLocalCurrency(int intermediateResult) {
        return intermediateResult;
    }

    private static int getSomeOtherMetric() {
        return 500;
    }
}
