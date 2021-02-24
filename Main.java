class Main {
    public static void main(String[] args) {
        Board board = new Board();
        for (int i = 0; i<8; i++){
            board.set(i,1,new Pawn(Color.WHITE));
        }
        for (int i = 0; i<8; i++){
            board.set(i,6, new Pawn(Color.BLACK));
        }
        board.set(3,0, new Queen(Color.WHITE));
        board.set(3,7, new Queen(Color.BLACK));
        board.set(7,0, new Rook(Color.WHITE));
        board.set(0,0, new Rook(Color.WHITE));
        board.set(7,7, new Rook(Color.BLACK));
        board.set(0,7, new Rook(Color.BLACK));
        board.set(6,7, new Knight(Color.BLACK));
        board.set(1,7, new Knight(Color.BLACK));


        System.out.print(board);
    }
}