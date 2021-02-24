public class Pawn extends Piece {
    public Pawn(Color color){
        super(color);
    }
    private String name = "pawn"; 
    private String icon = "♟";
    private Cord[] moves = {
        new Cord(0,-1),// up 1
        new Cord(0,-2),// up 2 
        // all of the moves 
    };// all moves within 
    private Cord[] takes = {
        new Cord(1,-1),// diagonal left 
        new Cord(-1,-1)//diagonal right
    };
    private boolean ray = false;

}
