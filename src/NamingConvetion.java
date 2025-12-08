/**
 * Naming :
 *    class: Capital letter -> Main, JavaDemo
 *    variable: lower case -> count, countOfRows
 *    constant: UPPER_CASE -> CLASS_NAME
 *    methods: (function) -> same as variable -> calculateSum
 *
 */
public class NamingConvetion {
    private String CLASS_NAME = "NamingConvetion";

    private String firstNumber;
    private String secondNumber;

    public NamingConvetion() {
        System.out.println("Initializing NamingConvetion");
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public NamingConvetion(String firstNumber, String secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public static void main(String[] args) {
        /**
         * Types of constructor:
         *   Default: which is present by default
         *   custom: you define arguments needed to create a class
         */
        NamingConvetion namingConvetion = new NamingConvetion("1", "2");
    }
}

