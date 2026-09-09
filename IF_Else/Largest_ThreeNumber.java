import java.util.Scanner;

public class Largest_ThreeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the num1:");
        int num1 = scan.nextInt();

        System.out.println("Enert the num2:");
        int num2 = scan.nextInt();

        System.out.println("Enert the num3:");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " " + "is Greatest number");
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " " + "is Greatest number");

        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " " + "is Greatest number");
        }

        else {
            System.out.println(0);

        }
        scan.close();
        

    }
}
