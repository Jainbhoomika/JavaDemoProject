package calculator;

public class Driver {
    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();

        System.out.println(calculator.sum(2, 4));
        System.out.println(calculator.sub(4, 2));
        System.out.println(calculator.multi(2, 4));
        System.out.println(calculator.div(4, 2));
    }
}
