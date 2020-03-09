package ThirdHW;

public class CheckMovement {

    public static boolean isHorseMovement(Position ... positions) throws IllegalMoveException{
        for(int i = 1; i < positions.length; i++){
            if(!is2and1(Math.abs(positions[i].getX()-positions[i-1].getX()),
                    Math.abs(positions[i].getY()-positions[i-1].getY()))){
                throw new IllegalMoveException(positions[i-1],positions[i]);
            }
        }
        return true;
    }

    private static boolean is2and1(int x, int y){
        return (x==2&&y==1)||(y==2&&x==1);
    }
}
