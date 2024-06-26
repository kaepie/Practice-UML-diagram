import java.util.ArrayList;
import java.util.Collections;

//6510450291 Chutipong Triyasith
public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Player player1 = new Player("peak");
        Player player2 = new Player("boss");
        Player player3 = new Player("ter");

        Collections.addAll(players, player1, player2, player3);
        MGame mGame = new MGame(players);
        mGame.playGame();
    }
}
