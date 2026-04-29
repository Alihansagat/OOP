package lab2.problem2;

public class Queen extends Piece {
    public Queen(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        boolean rookMove = a.getX() == b.getX() || a.getY() == b.getY();
        boolean bishopMove = Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY());

        return rookMove || bishopMove;
    }
}
