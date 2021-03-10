import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        Board board = new Board();
        for (int y = 0; y < 8; y += 7) {
            Color color = y == 0 ? Color.BLACK : Color.WHITE;
            for (int x = 0; x < Board.WIDTH; x++) {
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

        boolean gameOver = false;
        Color turn = Color.WHITE;
        while(!gameOver){
            System.out.println(board);
            System.out.print("It is "+turn+"'s turn. Enter cord of piece to move: ");

            String move = imp.nextLine();

            System.out.print("your move is "+move+" but we are out of time!");

            gameOver = true;
            //turn = turn == Color.BLACK ? Color.WHITE : Color.BLACK;
            
        }
    }
}