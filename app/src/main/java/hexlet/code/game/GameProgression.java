package hexlet.code.game;

import hexlet.code.Answer;
import hexlet.code.Question;
import hexlet.code.Random;
import hexlet.code.ResultTest;

public class GameProgression {
    public static boolean gamePlay() {
        System.out.println("What number is missing in the progression?");
        final int rangeOfRandomNumber = 100;
        int startNumber = Random.getRandom(rangeOfRandomNumber);
        final int rangeOfRandomIncrement = 20;
        int increment = Random.getRandom(rangeOfRandomIncrement);
        final int rangeOfRandomIndex = 10;
        int index = Random.getRandom(rangeOfRandomIndex);
        String question;
        String correctAnswer;
        String answer;
        final int sizeOfProgression = rangeOfRandomIndex;
        String[] progression = new  String[sizeOfProgression];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(startNumber);
            startNumber += increment;
        }
        correctAnswer = progression[index];
        progression[index] = "..";
        question = Question.getQuestionString(progression);
        System.out.println(question);
        answer = Answer.getAnswer();
        return ResultTest.getResultTest(answer, correctAnswer);
    }

}
