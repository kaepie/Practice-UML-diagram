import java.util.ArrayList;

//6510450291 Chutipong Triyasith
public class MGame {
    private int roundCnt;
    private ArrayList<Die> dice;
    private Board board;
    private ArrayList<Player> players;

    public MGame(int n) {
        players = new ArrayList<>();
        if (n < 2) {
            System.out.println("There are too few players.");
        }
        else if(n > 8){
            System.out.println("There are too many players.");
        }
        else {
            for (int i = 1; i <= n; i++) {
                players.add(new Player("Player " + i));
            }
        }
    }

    public void playGame(int n){
        if (players.size() < 2) {
            System.out.println("Players are not in the range of 2-8 people");
        }
        else if(players.size() > 8){
            System.out.println("Players are not in the range of 2-8 people");
        }
        else{
            for (roundCnt = 0; roundCnt < n; roundCnt++) {
                System.out.println("---------Round "+ roundCnt + "--------");
                playRound();
            }
        }
    }
    private void playRound(){
        for(Player player : players) {
            player.takeTurn();
        }
    }
}
