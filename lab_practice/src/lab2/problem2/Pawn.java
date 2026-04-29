package lab2.problem2;

public class Pawn extends Piece {
    public Pawn(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        return b.getX() == a.getX() && b.getY() == a.getY() + 1;
    }
}
