package hexlet.code;

import hexlet.code.game.GameCalc;
import hexlet.code.game.GameEven;

public class Engine {
    public static void newGame(int gameNumber) {
        if (gameNumber > 0) {
            String gamerName = getGamerName();
            if (gameNumber > 1) {
                boolean isWinGame = play(gameNumber);
                endGame(isWinGame, gamerName);
            }
        }
    }
    public static String getGamerName() {
        return  Cli.greeting();
    }
    public static boolean play(int gameNumber) {
        boolean isWinGame = false;
        switch (gameNumber) {
            case 2 -> {
                for (int i = 0; i < 3; i++) {
                    isWinGame = GameEven.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < 3; i++) {
                    isWinGame = GameCalc.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            default -> System.out.println("Something wrong ;(");
        }
        return isWinGame;
    }
    public static void endGame(boolean isWinGame, String gamerName) {
        if (isWinGame) {
            System.out.println("Congratulations, " + gamerName + "!");
        } else {
            System.out.println("Let's try again, " + gamerName + "!");
        }
    }
}