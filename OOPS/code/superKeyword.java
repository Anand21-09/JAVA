
class E {

    int speed = 50;

    E() {
        System.out.println("this is class E");
    }

    E(String name) {
        System.out.println("name : " + name);
    }

    void display() {
        System.out.println("parent display");
    }
}

class F extends E {

    int speed = 100;

    F() {
        super();
        System.out.println("child constructor");
    }

    void show() {
        System.out.println(speed);
        System.out.println(super.speed);
    }

    @Override
    void display() {
        System.out.println("child display");
        super.display();
    }
}

public class superKeyword {

    public static void main(String[] args) {
        F obj = new F();
        obj.show();
        obj.display();
    }
}
