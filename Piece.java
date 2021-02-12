public class Piece {
    private String color;
    private String name = "???";
    private Cord cord;
    private boolean hasMoved;
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
