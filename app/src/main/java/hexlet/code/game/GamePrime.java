package hexlet.code.game;

import hexlet.code.Answer;
import hexlet.code.PrimeNumber;
import hexlet.code.Question;
import hexlet.code.Random;
import hexlet.code.ResultTest;
import org.apache.commons.lang3.ArrayUtils;


public class GamePrime {
    public static boolean gamePlay() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int range = 100;
        int number = Random.getRandom(range);
        int[] primeNumberArray = PrimeNumber.getPrimeArray(number);
        String question;
        String correctAnswer;
        String answer;
        correctAnswer = (ArrayUtils.contains(primeNumberArray, number)) ? "yes" : "no";
        question = Question.getQuestionString(String.valueOf(number));
        System.out.println(question);
        answer = Answer.getAnswer();
        return ResultTest.getResultTest(answer, correctAnswer);
    }
}
