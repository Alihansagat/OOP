package lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        return Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY());
    }
}
