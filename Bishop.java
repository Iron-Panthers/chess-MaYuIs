public class Bishop extends Piece {
    public Bishop(Color color){
        super(color);
    }
    private String name = "bishop";
    private String icon = "♝";
    private Cord[] moves = {
        new Cord("up+right"),
        new Cord("down+right"),
        new Cord("down+left"),
        new Cord("up+left"),

    };
    private Cord[] takes = moves;
    private boolean ray = true;
}
