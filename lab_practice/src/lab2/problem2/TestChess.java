package lab2.problem2;

public class TestChess {

    public static void main(String[] args) {

        Position start = new Position(4,4);
        Position move1 = new Position(4,7);
        Position move2 = new Position(6,5);

        Piece rook = new Rook(start);
        Piece knight = new Knight(start);

        System.out.println("Rook move: " + rook.isLegalMove(move1));
        System.out.println("Knight move: " + knight.isLegalMove(move2));
    }
}