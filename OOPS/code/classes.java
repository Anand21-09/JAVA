
public class classes {

    public static void main(String[] args) {
        Keyboard obj = new Keyboard();
        obj.color = "black";
        obj.typing();
        obj.printOut();
    }
}

class Keyboard {

    String color; //instance variables
    int type; //instance variables

    public void typing() { //methodu()
        System.out.println("Hey there i am typing");
    }

    public void printOut() {
        System.out.println(this.color);
    }
}
