package hexlet.code;

import java.util.Scanner;

public class GameCalc {
    public static boolean gamePlay() {
        Scanner scanner =  new Scanner(System.in);
        int operator = (int) (3 * Math.random());
        int number1 = (int) (100 * Math.random());
        int number2 = (int) (100 * Math.random());
        String question;
        String correctAnswer;
        String answer;
        System.out.println("What is the result of the expression?");
        switch (operator) {
            case 0 -> {
                question = "Question: " + number1 + " + " + number2;
                correctAnswer = String.valueOf(number1 + number2);
            }
            case 1 -> {
                question = "Question: " + number1 + " - " + number2;
                correctAnswer = String.valueOf(number1 - number2);
            }
            case 2 -> {
                question = "Question: " + number1 + " * " + number2;
                correctAnswer = String.valueOf(number1 * number2);
            }
            default -> {
                question = "Something wrong ;( ";
                correctAnswer = "";
            }
        }
        System.out.println(question);
        System.out.print("Your answer: ");
        answer = scanner.next();
        return ResultTest.getResultTest(answer, correctAnswer);
    }
}
