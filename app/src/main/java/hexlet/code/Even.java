package hexlet.code;
import java.util.Scanner;
public class Even {
    public static void startGame() {
        boolean isWin;
        String userName = Cli.greeting();
        isWin = gameEven();
        if (isWin) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
    public static boolean gameEven() {
        Scanner scanner =  new Scanner(System.in);
        boolean isWin = true;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        for (int i = 0; i < 3; i++) {
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
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "' " + "is wrong answer ;(. ");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                isWin = false;
                break;
            }
        }
        return isWin;
    }
    private static boolean isEven(int testNumber) {
        return testNumber % 2 == 0;
    }
}
