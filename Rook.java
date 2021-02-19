public class Rook extends Piece {
    private String name = "rook";
    private Cord[] moves = {
        new Cord("up"),
        new Cord("down"),
        new Cord("left"),
        new Cord("right")
    };
    private Cord[] takes = moves;
    private boolean ray = true;
}
