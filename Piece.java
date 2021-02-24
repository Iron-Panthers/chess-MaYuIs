public class Piece {
    private Color color;
    private String name = "???";
    private String icon = "!";
    private Cord cord;
    private boolean hasMoved;
    // moves and takes are relitive to white
    // they will be inverted for black pieces
    // new Cord(0, -1) would be moving up
    // new Cord(1, -1) would be moving up and right
    private Cord[] moves;
    private Cord[] takes;
    private boolean ray;

    public Piece(Color color){
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return name.substring(0, 1).toUpperCase();
    }

}
