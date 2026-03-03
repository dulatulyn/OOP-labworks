package labwork2.problem2;

public class Bishop extends Piece {

    public Bishop(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isInsideBoard()) return false;
        return Math.abs(a.x - b.x) == Math.abs(a.y - b.y);
    }
}