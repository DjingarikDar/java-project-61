package hexlet.code.game;
import hexlet.code.Answer;
import hexlet.code.Question;
import hexlet.code.Random;
import hexlet.code.ResultTest;

public class GameEven {
    public static boolean gamePlay() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String correctAnswer;
        final int rangeForRandom = 100;
        int testNumber = Random.getRandom(rangeForRandom);
        System.out.println(Question.getQuestionString(String.valueOf(testNumber)));
        String answer = Answer.getAnswer();
        if (isEven(testNumber)) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return  ResultTest.getResultTest(answer, correctAnswer);
    }
    private static boolean isEven(int testNumber) {
        return testNumber % 2 == 0;
    }
}
