package SecondHW;

public class Circle extends Figure {
    private Point center;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.center = new Point(x,y);
        this.radius = radius;
    }

    Circle(int x,int y){
        this(x,y,5);
    }

    Circle(){
        this(0,0);
    }

    @Override
    boolean contains(int x, int y) {
        return (Math.pow(x-center.getX(),2)+Math.pow(y-center.getY(),2)<=radius*radius);
    }



    @Override
    public void move(int dx, int dy) {
        setCenter(new Point(getCenter().getX()+dx,getCenter().getY()+dy));
    }

    Circle(int radius){
        this(0,0,radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                "} ";
    }
}
