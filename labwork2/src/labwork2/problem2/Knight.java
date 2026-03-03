package labwork2.problem2;

public class Knight extends Piece {

    public Knight(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isInsideBoard()) return false;

        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);

        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}