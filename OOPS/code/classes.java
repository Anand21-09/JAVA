
// class Car {
//     String model;
//     private int speed;
//     void accelerate(int delta) {
//         speed += delta;
//     }
//     int getSpeed() {
//         return speed;
//     }
// }
// public class classes {
//     public static void main(String[] args) {
//         Car car = new Car();
//         car.model = "Nexa XL6";
//         car.accelerate(70);
//         System.out.println(car.getSpeed());
//     }
// }
class car {

    int modelNO = 56;
    String name = "thar";

    void show() {
        System.out.println(modelNO + " " + name);
    }

}

public class classes {

    public static void main(String[] args) {
        car c = new car();
        c.show();

    }
}
