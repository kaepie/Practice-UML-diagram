import java.util.ArrayList;

//6510450291 Chutipong Triyasith
public class MGame {
    private int roundCnt;
    private ArrayList<Die> dice;
    private Board board;
    private ArrayList<Player> players;

    public MGame(ArrayList<Player> players) {
        this.players = players;
    }

    public void playGame(){
        for(roundCnt = 0; roundCnt < 10; roundCnt++){
            playRound();
        }
    }
    private void playRound(){
        for(Player player : players) {
            player.takeTurn();
        }
    }
}
