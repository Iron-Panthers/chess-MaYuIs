public class Bishop extends Piece {
    private String name = "bishop";
    private Cord[] moves = {
        new Cord("up+right"),
        new Cord("down+right"),
        new Cord("down+left"),
        new Cord("up+left"),

    };
    private Cord[] takes = moves;
    private boolean ray = true;
}
