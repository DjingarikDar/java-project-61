package hexlet.code;
import java.util.Scanner;
public class GameEven {
    public static boolean gamePlay() {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        String correctAnswer;
        int testNumber = (int) (100 * Math.random());
        System.out.println("Question: " + testNumber);
        System.out.print("Your answer: ");
        String answer = scanner.next();
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
