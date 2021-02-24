public class Board {
    private Piece[] data;
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private static final StringBuilder blankEven = new StringBuilder();
    private static final StringBuilder blankOdd = new StringBuilder();

    public Board() {
        data = new Piece[WIDTH * HEIGHT];
        for (int x = 0; x < WIDTH; x++) {
            blankEven.append(x % 2 == 0 ? CC.BLACK_BACKGROUND : CC.WHITE_BACKGROUND);
            blankEven.append("      ");
            blankEven.append(CC.RESET);
            blankOdd.append(x % 2 != 0 ? CC.BLACK_BACKGROUND : CC.WHITE_BACKGROUND);
            blankOdd.append("      ");
            blankOdd.append(CC.RESET);
        }
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
        StringBuilder ret = new StringBuilder();/* String builder is just adds to the end of string */
        for (int y = 0, cord = HEIGHT; y < HEIGHT; y++, cord--) {
            ret.append("  ");
            ret.append(y%2==0 ? blankEven : blankOdd);
            ret.append("\n");
            ret.append(cord);// appened = add on to the end
            ret.append(" ");
            for (int x = 0; x < WIDTH; x++) {
                ret.append((x + y) % 2 == 0 ? CC.BLACK_BACKGROUND : CC.WHITE_BACKGROUND);
                if(this.get(x, y) != null){
                    ret.append("  ");
                    ret.append(this.get(x, y).getColor() == Color.BLACK ? CC.RED_BOLD_BRIGHT : CC.GREEN_BOLD_BRIGHT);
                    ret.append(this.get(x, y).toString());
                    ret.append(this.get(x, y).getIcon());
                    ret.append("  ");
                } else {
                    ret.append("      ");
                }
                
                ret.append(CC.RESET);
                /*
                 * null = nothing there ? if statment in one line
                 */
            }
            ret.append("\n  ");// making new line = \n
            ret.append(y%2==0 ? blankEven : blankOdd);
            ret.append("\n");
        }
        ret.append("  ");// nothing to draw between 1 and a
        for (int ch = 97; ch < 97 + WIDTH; ch++) { // 97 = beginning of the lower case alphabet
            ret.append("  ");
            ret.append((char) ch);
            ret.append("   ");
        }
        ret.append("  \n");
        return ret.toString();
    }
}
