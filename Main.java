class Main {
    public static void main(String[] args) {
        Board board = new Board();
        for (int y = 0; y < 8; y += 7) {
            Color color = y == 0 ? Color.BLACK : Color.WHITE;
            for (int x = 0; x < 8; x++) {
                board.set(x, y == 0 ? 1 : 6, new Pawn(color));
            }
            board.set(3, y, new Queen(color));
            board.set(4, y, new King(color));
            
            board.set(7, y, new Rook(color));
            board.set(0, y, new Rook(color));
            
            board.set(6, y, new Knight(color));
            board.set(1, y, new Knight(color));

            board.set(5, y, new Bishop(color));
            board.set(2, y, new Bishop(color));
        }
        
        System.out.print(board);
    }
}