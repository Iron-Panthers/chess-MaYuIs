class Main {
    public static void main(String[] args) {
        Board board = new Board();

        board.set(1, 0, new Pawn());
        board.set(1, 1, new Pawn());
        board.set(5, 0, new Pawn());

        Cord test = new Cord("up");

        System.out.print(board);
    }
}