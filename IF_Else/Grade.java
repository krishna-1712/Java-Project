import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter the mark:");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade: A");
        } else if (mark >= 74 && mark <= 89) {
            System.out.println("Grade: B");
        } else if (mark >= 50 && mark <= 74) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }

        scanner.close();
    }

}
