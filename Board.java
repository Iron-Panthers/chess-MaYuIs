public class Board {
    private Piece[] data;
    public static final int WIDTH = 12;
    public static final int HEIGHT = 12;

    public Board() {
        data = new Piece[WIDTH * HEIGHT];
    }

    private int getI(int x, int y) {
        return x * WIDTH + y;
    }

    public Piece get(int x, int y) {
        return data[getI(x, y)];
    }

    public void set(int x, int y, Piece piece) {
        data[getI(x, y)] = piece;
    }
}
