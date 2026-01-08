
import java.util.*;

public class tryWithResource {

    public static void main(String[] args) {
        tryWithResource obj = new tryWithResource();
        obj.tryandResourse();
    }

    public void tryandResourse() {

        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("enter a number : ");
            int num = sc.nextInt();
            System.out.print("you entered : " + num);
        } catch (Exception e) {
            System.out.println("error : " + e);
        }
        System.out.println();
        System.out.println("Scanner closed Automatically");
    }
}
