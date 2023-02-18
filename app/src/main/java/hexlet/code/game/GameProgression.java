package hexlet.code.game;

import hexlet.code.Answer;
import hexlet.code.Question;
import hexlet.code.ResultTest;

public class GameProgression {
    public static boolean gamePlay() {
        System.out.println("What number is missing in the progression?");
        int rangeForRandom = 100;
        int number = (int) (rangeForRandom * Math.random());
        rangeForRandom = 10;
        int increment = (int) (rangeForRandom * Math.random());
        int index = (int) (rangeForRandom * Math.random());
        String question;
        String correctAnswer;
        String answer;
        String[] progression = new  String[10];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = String.valueOf(number);
            number += increment;
        }
        correctAnswer = progression[index];
        progression[index] = "..";
        question = Question.getQuestionString(progression);
        System.out.println(question);
        answer = Answer.getAnswer();
        return ResultTest.getResultTest(answer, correctAnswer);
    }

}
