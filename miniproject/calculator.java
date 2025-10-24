import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/) : ");
        String operator = sc.next();

        int result = 0;


        switch(operator){
            case "+":
            result = a+b;
            System.out.print("a+b : "+result);
            break;

            case "-": 
            result = a-b; 
            System.out.print("a-b : "+result);
            break;
 
            case "*": 
            result = a*b;
            System.out.print("a*b : "+result);
            break;

            case "/": 
            {
                if(b!=0){
                    result = a/b;
                    System.out.println("a/b : "+result);
                }
                else{
                    System.out.println("Invalid input");
                }
                
            }
            break;
            
            default:
                System.out.println("Invalid operator.");
                break;
            


        }

        

    }
}