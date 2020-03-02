package SecondHW;

public class Annotation {
    private Figure bound;
    private String name;

    public static Annotation findByPoint(Annotation[] annotations, int x, int y){
        for(Annotation i: annotations){
            if(i.getBound().contains(x,y))
                return i;
        }
        return null;
    }

    public Annotation(Figure bound, String name) {
        this.bound = bound;
        this.name = name;
    }

    public Annotation(Figure bound){
        this(bound,"Untitled");
    }

    public Figure getBound() {
        return bound;
    }

    public void setBound(Figure bound) {
        this.bound = bound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = !name.equals("") ? name : this.name;
    }

    @Override
    public String toString() {
        return "Annotation{" +
                "bound=" + bound +
                ", name='" + name + '\'' +
                '}';
    }
}
