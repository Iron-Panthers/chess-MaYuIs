public class Piece {
    private String color;
    private String name = "???";
    private Cord cord;
    private boolean hasMoved;
    //moves and takes are relitive to white
    //they will be inverted for black pieces
    //new Cord(0, -1) would be moving up
    //new Cord(1, -1) would be moving up and right
    private Cord[] moves;
    private Cord[] takes;
    private boolean ray;


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return name.substring(0, 1).toUpperCase();
    }

}
