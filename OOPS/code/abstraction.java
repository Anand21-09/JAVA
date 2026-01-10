
abstract class shape {

    shape() {
        System.out.println("I am shape");
    }

    abstract void area();

    void display() {
        System.out.println("This is a shape");
    }
}

class circle extends shape {

    double radius;

    circle(double r) {
        this.radius = r;
    }

    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area : " + area);
    }
}

class rectangle extends shape {

    double height;
    double width;

    rectangle(double l, double w) {
        this.height = l;
        this.width = w;
    }

    @Override
    void area() {
        double area = height * width;
        System.out.println("Rectangle area : " + area);
    }
}

public class abstraction {

    public static void main(String[] args) {

        shape s1 = new circle(5);
        shape s2 = new rectangle(4, 5);
        s1.area();
        s2.area();
        s1.display();
    }
}
