public class King extends Piece {
    public King(Color color){
        super(color);
    }
    private String name = "king";
    private String icon = "♚";
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
