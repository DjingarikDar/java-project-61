package hexlet.code;

public class GCD {
    public static int getGCD(int number1, int number2) {

        int firstNumber;
        int secondNumber;
        int nod;

        if (number1 == number2) {
            return Math.abs(number1);
        }

        if (number1 > number2) {
            firstNumber = Math.abs(number1);
            secondNumber = Math.abs(number2);
        } else {
            firstNumber = Math.abs(number2);
            secondNumber = Math.abs(number1);
        }

        do {
            nod = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = nod;
        } while (secondNumber != 0);
        return firstNumber;
    }
}
