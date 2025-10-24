
import javax.swing.JOptionPane;

class Guicalculator {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number : "));

        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number : "));

        String operator = JOptionPane.showInputDialog("Enter operator(+,-,*,/,%) : ");

        int result = 0;
        String message = "";

        switch (operator) {
            case "+":
                result = a + b;
                message = "a+b : " + result;
                break;

            case "-":
                result = a - b;
                message = "a-b : " + result;
                break;

            case "*":
                result = a * b;
                message = "a*b : " + result;
                break;

            case "/": {
                if (b != 0) {
                    result = a / b;
                    message = "a/b : " + result;
                } else {
                    message = "Invalid input";
                }

            }
            break;
            case "%":
                result = (a * 100) / b;
                message = "a%b : " + result + "%";
                break;

            default:
                message = "Invalid operator.";
                break;

        }
        JOptionPane.showMessageDialog(null, message);

    }
}
