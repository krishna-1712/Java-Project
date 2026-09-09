import java.util.Scanner;

public class Calculator {
    static int addtion(int num, int num2) {
        return num + num2;
    }

    static int subbration(int num, int num2) {
        return num - num2;
    }

    static int multiplication(int num, int num2) {
        return num * num2;
    }

    static int division(int num, int num2)

    {

        return num / num2;

    }

 public static void main(String[] args) {
        System.out.println("Enter the number1:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Enter the number2:");
        int num2 = scan.nextInt();
        System.out.println("Enter the option:");
        int option = scan.nextInt();

        switch (option) {
            case 1: System.out.println("Addtion of Number is:" + addtion(num, num2));
                

                break;
            case 2:  System.out.println("Subraction of Number is:" + subbration(num, num2));
               
                break;
            case 3: System.out.println("Multiplication of Number is:" + multiplication(num, num2));
                
                break;
            case 4: System.out.println("Division of Number is:" + division(num, num2));
                
                break;
            default:  System.out.println("Not a option");
               

        }
scan.close();
    }
}