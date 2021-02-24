public class Bishop extends Piece {
    public Bishop(Color color){
        super(color, "bishop", "♝", 
        new Cord[]{
            new Cord("up+right"),
            new Cord("down+right"),
            new Cord("down+left"),
            new Cord("up+left"),
    
        },
        new Cord[]{
            new Cord("up+right"),
            new Cord("down+right"),
            new Cord("down+left"),
            new Cord("up+left"),
    
        }, 
        true
        );
    }
}
