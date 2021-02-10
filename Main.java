class Main {
    public static void main(String[] args) {
        Board board = new Board();

        board.set(0, 1, new Pawn());

        System.out.print(board);
    }
}