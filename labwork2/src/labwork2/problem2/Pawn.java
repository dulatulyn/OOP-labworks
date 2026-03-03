package labwork2.problem2;

public class Pawn extends Piece {

    public Pawn(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isInsideBoard()) return false;

        int direction = isWhite ? 1 : -1;

        if (a.x == b.x && b.y - a.y == direction) return true;

        if (a.x == b.x &&
                ((isWhite && a.y == 1) || (!isWhite && a.y == 6)) &&
                b.y - a.y == 2 * direction) return true;

        return false;
    }
}