
// public class polymorphism {
//     public static void main(String[] args) {
//         maths nums = new maths();
//         nums.add(4, 5);
//         nums.add(1, 2, 3);
//     }
// }
// class maths {
//     public void add(int a, int b) {
//         System.out.println(a + b);
//     }
//     public void add(int a, int b, int c) {
//         System.out.println(a + b + c);
//     }
// }
public class polymorphism {

    public static void main(String[] args) {
        cute animal = new cute();
        animal.eating();
    }
}

class Animal {

    public void eating() {
        System.out.println("this cow is eating");
    }
}

class cute extends Animal {

    public void eating() {
        System.out.println("this cow is cute");
    }
}
