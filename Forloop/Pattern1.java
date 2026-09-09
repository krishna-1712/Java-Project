import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = scan.nextInt();
        System.out.println("Enter The Number");
        int num2 = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num2; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

    }

}
