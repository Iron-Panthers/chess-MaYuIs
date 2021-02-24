public class King extends Piece {
    public King(Color color){
        super(color, "king", "♚",
        new Cord[]{
            new Cord("up"),
            new Cord("down"),
            new Cord("right"),
            new Cord("left"),
            new Cord("up+right"),
            new Cord("up+left"),
            new Cord("down+right"),
            new Cord("down+left"),
        },
        new Cord[]{
            new Cord("up"),
            new Cord("down"),
            new Cord("right"),
            new Cord("left"),
            new Cord("up+right"),
            new Cord("up+left"),
            new Cord("down+right"),
            new Cord("down+left"),
        },
        false
        );
    }
}
