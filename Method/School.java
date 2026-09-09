import java.util.Scanner;

public class School {

     String passorfail(int mark) {
        if (mark > 35) {
            return "Pass";
        } else {
            return "Fail";
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Mark:");
        int mark = scan.nextInt();
        School obj = new School();

        String result =obj.passorfail(mark);
        System.out.println(result);
        scan.close();
    }
}
