package hexlet.code;

import hexlet.code.game.GameCalc;
import hexlet.code.game.GameEven;
import hexlet.code.game.GameGCD;
import hexlet.code.game.GamePrime;
import hexlet.code.game.GameProgression;

public class Engine {
    public static void newGame(int choiceGame) {
        if (choiceGame > 0) {
            String gamerName = getGamerName();
            if (choiceGame > 1) {
                boolean isWinGame = play(choiceGame);
                endGame(isWinGame, gamerName);
            }
        }
    }
    public static String getGamerName() {
        return  Cli.greeting();
    }
    public static boolean play(int choiceGame) {
        boolean isWinGame = false;
        final int numberOfRepetitions = 3;
        switch (choiceGame) {
            case 2 -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameEven.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameCalc.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case 4 -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameGCD.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case 5 -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameProgression.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case 6 -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GamePrime.gamePlay();
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
