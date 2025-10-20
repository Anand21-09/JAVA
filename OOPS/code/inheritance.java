
public class inheritance {

    public static void main(String[] args) {
        cat mew = new cat();
        mew.eating();
        System.out.println(mew.color);
        rat mouse = new rat();
        mouse.laugh();
    }
}

class dog {

    int age = 5;
    String color = "brown";

    public void eating() {
        System.out.println("This dog is eating");
    }
}

class cat extends dog {

    public void laugh() {
        System.out.println("the cat is laughing");
    }
}

class rat extends cat {

    public void running() {
        System.out.println("the rat is running");
    }
}
