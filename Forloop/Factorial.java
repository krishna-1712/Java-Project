import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        
        int input = 6;
        int factorial = 1;
        

        for (int i = input; i >= 1; i--) {
            factorial = factorial * i;

        }
        int s=factorial-10;
        System.out.println("Factorial of " + input + " is: " + s);

    }

}
