public class Queen extends Piece {
    public Queen(Color color){
        super(color, "queen", "♛",
        new Cord[] {
            new Cord("up"),
            new Cord("down"),
            new Cord("right"),
            new Cord("left"),
            new Cord("up+right"),
            new Cord("up+left"),
            new Cord("down+left"),
            new Cord("down+right")},// taking this data from the Cord class 
        new Cord[] {
            new Cord("up"),
            new Cord("down"),
            new Cord("right"),
            new Cord("left"),
            new Cord("up+right"),
            new Cord("up+left"),
            new Cord("down+left"),
            new Cord("down+right")},
        true
        );
    }
}