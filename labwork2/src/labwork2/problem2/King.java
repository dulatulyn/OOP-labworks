package labwork2.problem2;

public class King extends Piece {

    public King(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isInsideBoard()) return false;

        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);

        return dx <= 1 && dy <= 1;
    }
}