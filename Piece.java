public class Piece {
    private String color;
    private String name = "???";
    private int x = 0;
    private int y = 0;


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
