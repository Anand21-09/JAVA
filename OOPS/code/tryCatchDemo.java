
import java.util.*;

public class tryCatchDemo {

    public int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int val = 0;
        try {
            val = sc.nextInt();
        } catch (Exception e) {
            System.out.println("failed " + e);
        }
        return val;
    }

    public static void main(String[] args) {
        tryCatchDemo obj = new tryCatchDemo();
        System.out.print(" insert a number : ");
        int val = obj.getUserInput();
        System.out.print("Inserted Value : " + val);

    }
}
