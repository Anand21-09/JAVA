
class Device {

    void charge() {
        System.out.println("charging device.......");
    }

}

class Phone extends Device {

    @Override
    void charge() {
        System.out.println("phone is charging with type c cable");
    }
}

class Laptop extends Device {

    @Override
    void charge() {
        System.out.println("Laptop is charging with power adapter");
    }
}

class Smartwatch extends Device {

    @Override
    void charge() {
        System.out.println("Smartwatch is charging wirelessly");
    }
}

public class runtimePolymorphism {

    public static void main(String[] args) {
        Device d;
        d = new Phone();
        d.charge();
        d = new Laptop();
        d.charge();
        d = new Smartwatch();
        d.charge();

    }
}
