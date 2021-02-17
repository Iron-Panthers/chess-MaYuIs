public class Queen extends Piece {
    private String name = "queen";
    private Cord[] moves = {
        new Cord(0,-1),
        new Cord(1,-1),
        new Cord(1,0),
        new Cord(1,1),
        //negative is right, positive is left
        //finish the cords
    };
    private Cord[] takes = moves;
    private boolean ray = true;

}

