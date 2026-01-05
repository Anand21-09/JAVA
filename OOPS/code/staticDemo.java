
class student {

    static String canteen;
    static String university;

    static {
        System.out.println("Static block invoked");
        canteen = "messy mess";
        university = "IIT Noida";
        greetStudent();
    }
    String name;
    int rollNumber;

    student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    static void greetStudent() {
        System.out.println("Hello and welcome to " + university);
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

public class staticDemo {

    public static void main(String[] args) {
        System.out.println(student.canteen);
        System.out.println(student.university);
    }
}
