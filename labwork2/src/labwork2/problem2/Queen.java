package labwork2.problem2;

public class Queen extends Piece {

    public Queen(Position a, boolean isWhite) {
        super(a, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.isInsideBoard()) return false;

        boolean rookMove = a.x == b.x || a.y == b.y;
        boolean bishopMove = Math.abs(a.x - b.x) == Math.abs(a.y - b.y);

        return rookMove || bishopMove;
    }
}