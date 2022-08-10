public class MGame {
    private int roundCat;
    private Player[] players;   // 2 - 8 players
    private Die[] die;  // 2 die

    public void playGame(int N) {
        while (roundCat < N) {
            playRound();
        }
    }

    private void playRound() {
        for (Player player: players) {
            player.takeTurn();
        }
    }
}
