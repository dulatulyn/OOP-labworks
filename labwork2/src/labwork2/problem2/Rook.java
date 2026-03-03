package labwork2.problem2;

public class Rook extends Piece {

    public Rook(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isInsideBoard()) return false;
        return a.x == b.x || a.y == b.y;
    }
}