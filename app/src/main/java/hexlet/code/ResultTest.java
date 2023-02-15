package hexlet.code;

public class ResultTest {
    public static boolean getResultTest(String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.print("'" + answer + "' " + "is wrong answer ;(. ");
            System.out.println("Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }
}
