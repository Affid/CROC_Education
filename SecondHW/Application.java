package SecondHW;

public class Application {

    public static void main(String[] args) {
        Annotation a1 = new Annotation(new BoundingBox(5,5),"First bound");
        Annotation a2 = new Annotation(new Circle(5),"The Circle");
        Annotation a3 = new Annotation(new BoundingBox(0,5,15,15),"The Box");
        Annotation a4 = new Annotation(new Circle(5,5));
        Annotation a5 = new Annotation(new Circle(10,-2,15),"Full Circle");
        Annotation[] annotations = new Annotation[]{a1,a2,a3,a4,a5};

        System.out.println(Annotation.findByPoint(annotations,14,14));

        annotations[3].getBound().move(5,-10);

        System.out.println(annotations[3]);

    }

}
