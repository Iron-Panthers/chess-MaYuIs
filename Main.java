class Main {
    public static void main(String[] args) {
        Board board = new Board();
        for (int i = 0; i<8; i++){
            board.set(i,1,new Pawn(Color.WHITE));
        }
        for (int i = 0; i<8; i++){
            board.set(i,6, new Pawn(Color.BLACK));
        }


        System.out.print(board);
    }
}