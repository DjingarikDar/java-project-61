package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        Game game = new Game();
        if (choice != 0) {
            game.setGameNumber(choice);
            game.setGamerName(Cli.greeting());
            game.startGame();
            game.endGame();
        }
    }
}
