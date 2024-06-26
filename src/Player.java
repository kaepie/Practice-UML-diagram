import java.util.ArrayList;
//6510450291 Chutipong Triyasith
public class Player {

    private String name;
    private ArrayList<Die> dice;
    private Board board;
    private Piece piece;

    public Player(String name) {
        this.name = name;
        dice = new ArrayList<>();
        piece = new Piece();
        board = new Board();
        dice.add(new Die());
        dice.add(new Die());
    }

    public void takeTurn(){
        int fv = 0;
        for(Die die : dice){
            die.roll();
            fv += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        System.out.println("Name = "+ name);
        System.out.println("die1 = "+ dice.get(0).getFaceValue());
        System.out.println("die2 = "+ dice.get(1).getFaceValue());
        System.out.println("fv = " + fv);
        System.out.println("New Location = " + board.getSquares().get(board.getSquares().indexOf(newLoc)));
        System.out.println("-------------------------");

        piece.setLocation(newLoc);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Die> getDice() {
        return dice;
    }

    public Piece getPiece() {
        return piece;
    }

    public Board getBoard() {
        return board;
    }
}
