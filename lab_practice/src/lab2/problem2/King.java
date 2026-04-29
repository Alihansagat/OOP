package lab2.problem2;

public class King extends Piece {
    public King(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){

        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());

        return dx <= 1 && dy <= 1;
    }
}
