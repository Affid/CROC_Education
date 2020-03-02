package SecondHW;

public class BoundingBox extends Figure{

    private Point point1, point2;

    public BoundingBox(int x1, int y1, int x2, int y2) {
        this.point1 = new Point(x1,y1);
        this.point2 = new Point(x2,y2);
    }

    public BoundingBox(int x1, int y1){
        this(x1,y1,0,0);
    }

    @Override
    boolean contains(int x, int y) {
        return (isBetween(point1.getX(),point2.getX(),x)&&isBetween(point1.getY(),point2.getY(),y));
    }

    private static boolean isBetween(int x1, int x2, int point){
        return (point<=Math.max(x1,x2)&&point>=Math.min(x1,x2));
    }

    @Override
    public void move(int dx, int dy) {
        setPoint1(new Point(point1.getX()+dx,point2.getY()+dy));
        setPoint2(new Point(point2.getX()+dx,point2.getY()+dy));
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "BoundingBox{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                "} ";
    }
}
