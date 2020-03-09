package ThirdHW;

public class Position {
    private static char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private int x, y;

    public Position(int x, int y) {
        if (x < 0 || x > 7 || y < 0 || y > 7)
            throw new IllegalArgumentException("Значения не в диапазоне 0-7!");
        this.x = x;
        this.y = y;
    }

    public Position() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0 || x > 7)
            throw new IllegalArgumentException("Значение не в диапазоне 0-7!");
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0 || y > 7)
            throw new IllegalArgumentException("Значение не в диапазоне 0-7!");
        this.y = y;
    }

    @Override
    public String toString() {
        return letters[x] + "" + (y + 1);
    }

    public static Position[] toPositions(String[] pos) {
        for (String i : pos) {
            if (i.length() != 2)
                throw new IllegalArgumentException(i + ": Некорректная длина строки!");
        }
        Position[] positions = new Position[pos.length];
        for (int i = 0; i < pos.length; i++) {
            char x = pos[i].charAt(0);
            int y = pos[i].charAt(1) - '0';
            positions[i] = new Position(x - 'a', y - 1);
        }
        return positions;
    }
}
