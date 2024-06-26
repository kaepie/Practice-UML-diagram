import java.util.ArrayList;

//6510450291 Chutipong Triyasith
public class Board {
    private ArrayList<Square> squares;

    public Board (){
        this.squares = new ArrayList<>();
        for (int i = 1; i <= 40; i++) {
            squares.add(new Square("Square " + i));
        }
    }
    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public Square getSquare(Square oldLoc, int fv){
        int indexOfSquare = squares.indexOf(oldLoc);
        int newLoc = indexOfSquare + fv;
        return newLoc >= 40 ? squares.get(newLoc % 40) : squares.get(newLoc);
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
}
