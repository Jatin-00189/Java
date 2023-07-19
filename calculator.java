import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Create object of Scanner class to take input
        Scanner sc = new Scanner(System.in);
        //Print options
        System.out.println("Choose operation between \"+ , - , * , / , %\" : ");
        //Take input of operator
        String op = sc.next();
        // First operand
        System.out.println("First operand : ");
        double a = sc.nextDouble();
        // Second operand
        System.out.println("Second operand : ");
        double b = sc.nextDouble();
// Define switch to perform actions based on cases
        switch (op){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Operator");


        }
    }
}
