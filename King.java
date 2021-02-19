public class King extends Piece {
    private String name = "king";
    private Cord[] moves = {
        new Cord("up"),
        new Cord("down"),
        new Cord("right"),
        new Cord("left"),
        new Cord("up+right"),
        new Cord("up+left"),
        new Cord("down+right"),
        new Cord("down+left"),
    };
    private Cord[] takes = moves;
    private boolean ray = false;
    
}
