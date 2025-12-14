package calculator;

public class SimpleCalculator extends Calculator {

    public Integer sum(int a, int b) {
        return a+b;}

    public Integer sub(int a, int b) {
        return a-b;
    }

    public Integer multi(int a, int b) {
        return a*b;
    }

    public Integer div(int a, int b) {
        return a/b;
    }
}