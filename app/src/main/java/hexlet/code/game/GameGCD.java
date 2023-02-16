package hexlet.code.game;

import hexlet.code.Answer;
import hexlet.code.GCD;
import hexlet.code.Question;
import hexlet.code.ResultTest;

public class GameGCD {
    public static boolean gamePlay() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int number1 = (int) (100 * Math.random());
        int number2 = (int) (100 * Math.random());
        String question;
        String correctAnswer;
        String answer;
        question = Question.getQuestionString(String.valueOf(number1), " ", String.valueOf(number2));
        correctAnswer = String.valueOf(GCD.getGCD(number1, number2));
        System.out.println(question);
        answer = Answer.getAnswer();
        return ResultTest.getResultTest(answer, correctAnswer);
    }
}
