import java.util.Scanner;

public class Oddeven {
    void evenorodd(int num) {
        if (num % 2 == 0) {

            System.out.println(num + " : " + "is Even Number");
        } else {
            System.out.println(num + " : " + "is Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enetr the number:");
        int num = scan.nextInt();
        Oddeven obg1 = new Oddeven();
        obg1.evenorodd(num);
        // System.out.println(result);
        scan.close();

    }
}