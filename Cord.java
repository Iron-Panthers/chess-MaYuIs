public class Cord {
    private int x;
    private int y;

    public Cord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Cord easy(String direction) {
        switch (direction) {
            case "up":
                return new Cord(0, -1);
            case "down":
                return new Cord(0, 1);
            case "right":
                return new Cord(1, 0);
            case "left":
                return new Cord(-1, 0);
            default:
                System.out.print("bad thing has happened");
                return new Cord(0, 0);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
