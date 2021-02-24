public class Rook extends Piece {
    public Rook(Color color){
        super(color, "rook", "♜",
        new Cord[] {
            new Cord("up"),
            new Cord("down"),
            new Cord("left"),
            new Cord("right")
        },
        new Cord[] {
            new Cord("up"),
            new Cord("down"),
            new Cord("left"),
            new Cord("right")
        },
        true
        );
    }
}
