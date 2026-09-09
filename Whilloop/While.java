import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Password:");

            int a = scan.nextInt();

            if (a == 1234) {
                System.out.println("password is correct");
            }
           
                else {
                    System.out.println("Incorrect Password!!");

                }
                

            
        }
    
    }
}
