package ThirdHW;

public class App {

    public static void main(String[] args) {
        String[] positions = new String[]{"g8", "e7", "e6"};
        try {
            if (CheckMovement.isHorseMovement(Position.toPositions(positions)))
                System.out.println("OK");
        } catch (IllegalMoveException e) {
            System.out.println("конь так не ходит: " + e.getFrom() + " -> " + e.getTo());
        }
        positions = new String[]{"g8", "e7", "c8", "d6", "b5", "c7"};
        try {
            if (CheckMovement.isHorseMovement(Position.toPositions(positions)))
                System.out.println("OK");
        } catch (IllegalMoveException e) {
            System.out.println("конь так не ходит: " + e.getFrom() + "->" + e.getTo());
        }
    }
}
