public class Knight extends Piece{// + left + - 3ight 
    private String name = "Knight"; 
    private Cord[] moves = {
        new Cord(3,-1),// up 1 left 3
        new Cord(-3,-1),// up 1 right 3
        new Cord(3,1),// down 1 left 3
        new Cord(-3,1),// down 1 right 3
        new Cord(3,1),// down 3 left 1
        new Cord(-3,-1),// up 3  left 1
        new Cord(3,1),// down 3 right 1
        new Cord(-3,-1)// up 3  right 1
        // all of the moves 
    };// all moves within 
    private boolean ray = false;
}
