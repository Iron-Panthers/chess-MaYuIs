import java.util.*; //fight me

public class Piece {
    private Color color;
    private String name;
    private String icon;
    private Cord cord;
    private boolean hasMoved;
    // moves and takes are relitive to white
    // they will be inverted for black pieces
    // new Cord(0, -1) would be moving up
    // new Cord(1, -1) would be moving up and right
    private Cord[] moves;
    private Cord[] takes;
    private boolean ray;

    public Piece(Color color, String name, String icon, Cord[] moves, Cord[] takes, boolean ray) {
        this.color = color;
        this.name = name;
        this.icon = icon;
        this.moves = moves;
        this.takes = takes;
        this.ray = ray;
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

    public Cord[] allMovesRelCords() {
        if (!this.ray) {
            return this.moves;
        }

        ArrayList<Cord> moves = new ArrayList<Cord>();

        for (Cord move : this.moves) {
            for (int mag = 1; mag < 8; mag++) {
                System.out.println(move.getX() * mag);
            }

        }

        return new Cord[] { new Cord(0, 0) };
    }

}
