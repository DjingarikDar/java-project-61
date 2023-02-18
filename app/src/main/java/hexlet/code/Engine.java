package hexlet.code;

import hexlet.code.game.GameCalc;
import hexlet.code.game.GameEven;
import hexlet.code.game.GameGCD;
import hexlet.code.game.GamePrime;
import hexlet.code.game.GameProgression;

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
        final int numberOfRepetitions = 3;
        final int gameEven = 2;
        final int gameCalc = 3;
        final int gameGCD = 4;
        final int gameProgression = 5;
        final int gamePrime = 6;
        switch (gameNumber) {
            case gameEven -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameEven.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case gameCalc -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameCalc.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case gameGCD -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameGCD.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case gameProgression -> {
                for (int i = 0; i < numberOfRepetitions; i++) {
                    isWinGame = GameProgression.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            }
            case gamePrime -> {
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
