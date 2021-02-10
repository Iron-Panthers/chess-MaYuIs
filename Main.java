class Main{
    public static void main(String[] args){
        Board board = new Board();

        board.set(0,0, new Piece());

        System.out.print(board.get(0,0).name);
    }
}