public class Queen extends Piece {
    public Queen(Color color){
        super(color);
    }
    private String name = "queen";
    private Cord[] moves = {
        new Cord("up"),
        new Cord("down"),
        new Cord("right"),
        new Cord("left"),
        new Cord("up+right"),
        new Cord("up+left"),
        new Cord("down+left"),
        new Cord("down+right")// taking this data from the Cord class 
    };
    private Cord[] takes = moves; // doesn't have new moves to take pieces  
    private boolean ray = true;
}