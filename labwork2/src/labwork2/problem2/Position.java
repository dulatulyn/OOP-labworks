package labwork2.problem2;

public class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInsideBoard() {
        return x >= 0 && x < 8 &&
                y >= 0 && y < 8;
    }
}
