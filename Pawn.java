public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color, "pawn", "♟", 
        new Cord[] { 
            new Cord(0, -1), new Cord(0, -2), 
        },
        new Cord[] { 
            new Cord(1, -1), new Cord(-1, -1) 
        }, false);
    }
}
