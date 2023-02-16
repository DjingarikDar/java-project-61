package hexlet.code;

import java.util.Scanner;

public class Answer {
    public static String getAnswer() {
        Scanner scanner =  new Scanner(System.in);
        String answer;
        System.out.print("Your answer: ");
        answer = scanner.next();
        return answer;
    }
}
