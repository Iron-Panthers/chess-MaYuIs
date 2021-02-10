public class Board {
    private Piece[] data;
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

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

    public String toString(){
        StringBuilder ret = new StringBuilder();
        for(int y = 0; y < HEIGHT; y++){
            for(int x = 0; x < WIDTH; x++){
                ret.append((this.get(x, y) != null ? this.get(x, y).toString() : ".") + " ");
            }
            ret.append("\n");
        }
        return ret.toString();
    }
}
