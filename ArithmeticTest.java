import arithmetic.*;

public class ArithmeticTest {
    public static void main(String[] args) {
        double number1 = 10.5;
        double number2 = 5.0;

        // Perform addition
        Addition addition = new Addition();
        double sum = addition.calculate(number1, number2);
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + sum);

        // Perform subtraction
        Subtraction subtraction = new Subtraction();
        double difference = subtraction.calculate(number1, number2);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + difference);

        // Perform multiplication
        Multiplication multiplication = new Multiplication();
        double product = multiplication.calculate(number1, number2);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + product);

        // Perform division
        Division division = new Division();
        double quotient = division.calculate(number1, number2);
        System.out.println("Division: " + number1 + " / " + number2 + " = " + quotient);
    }
}

