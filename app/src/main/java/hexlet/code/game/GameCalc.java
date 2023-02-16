package hexlet.code.game;

import hexlet.code.Answer;
import hexlet.code.Question;
import hexlet.code.ResultTest;


public class GameCalc {
    public static boolean gamePlay() {
        System.out.println("What is the result of the expression?");
        int operator = (int) (3 * Math.random());
        int number1 = (int) (100 * Math.random());
        int number2 = (int) (100 * Math.random());
        String question;
        String correctAnswer;
        String answer;
        switch (operator) {
            case 0 -> {
                question = Question.getQuestionString(String.valueOf(number1), " + ", String.valueOf(number2));
                correctAnswer = String.valueOf(number1 + number2);
            }
            case 1 -> {
                question = Question.getQuestionString(String.valueOf(number1), " - ", String.valueOf(number2));
                correctAnswer = String.valueOf(number1 - number2);
            }
            case 2 -> {
                question = Question.getQuestionString(String.valueOf(number1), " * ", String.valueOf(number2));
                correctAnswer = String.valueOf(number1 * number2);
            }
            default -> {
                question = "Something wrong ;( ";
                correctAnswer = "";
            }
        }
        System.out.println(question);
        answer = Answer.getAnswer();
        return ResultTest.getResultTest(answer, correctAnswer);
    }
}
