package ThirdHW;

public class IllegalMoveException extends Exception {
    private Position from, to;

    public IllegalMoveException(Position from, Position to) {
        this.from = from;
        this.to = to;
    }

    public Position getFrom() {
        return from;
    }

    public Position getTo() {
        return to;
    }
}
