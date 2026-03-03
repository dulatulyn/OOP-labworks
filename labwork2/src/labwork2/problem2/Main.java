package labwork2.problem2;

public class Main {
    public static void main(String[] args) {
        Pawn pawn = new Pawn(new Position(0, 1), true);
        System.out.println(pawn.isLegalMove(new Position(0, 2)));
        System.out.println(pawn.isLegalMove(new Position(0, 3)));
        System.out.println(pawn.isLegalMove(new Position(0, 4)));

        Rook rook = new Rook(new Position(0, 0), true);
        System.out.println(rook.isLegalMove(new Position(0, 2)));
        System.out.println(rook.isLegalMove(new Position(1, 1)));
        System.out.println(rook.isLegalMove(new Position(2, 0)));
    }
}
