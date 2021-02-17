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

    public String toString() {
        StringBuilder ret = new StringBuilder();/* String builder is just adds to the end of  string*/
        for (int y = 0, cord = HEIGHT; y < HEIGHT; y++, cord--) {
            /* height =  8
             cord = height
              cord = 8 */
            ret.append(cord + " ");// appened =  add on to the end 
            for (int x = 0; x < WIDTH; x++) {
                ret.append((this.get(x, y) != null ? this.get(x, y).toString() : ".") + " ");
                /* null = nothing there 
                ? if statment in one line*/ 
            }
            ret.append("\n");// making new line  = \n
        }
        ret.append("  ");// nothing to draw between 1 and a 
        for (int ch = 97; ch < 97 + WIDTH; ch++) { // 97 = beginning of the lower case alphabet 
            ret.append((char) ch + " ");
        }
        ret.append("  \n");
        return ret.toString();
    }
}
