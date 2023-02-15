package hexlet.code;

class Game {
    private int gameNumber;
    private boolean isWinGame;
    private String gamerName;
    Game() {
        this.isWinGame = false;
    }

     /* public String getGamerName() {
     return gamerName;
     } */

    public void setGamerName(String name) {
        this.gamerName = name;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }
    public void startGame() {
        switch (gameNumber) {
            case 1:
                return;
            case 2:
                for (int i = 0; i < 3; i++) {
                    isWinGame = GameEven.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    isWinGame = GameCalc.gamePlay();
                    if (!isWinGame) {
                        break;
                    }
                }
            case 0:
                break;
            default:
                System.out.println("Something wrong ;(");
        }
    }
    public void endGame() {
        if (gameNumber > 1) {
            resultGame();
        }
    }
    private void resultGame() {
        if (this.isWinGame) {
            System.out.println("Congratulations, " + this.gamerName + "!");
        } else {
            System.out.println("Let's try again, " + this.gamerName + "!");
        }
    }
}
