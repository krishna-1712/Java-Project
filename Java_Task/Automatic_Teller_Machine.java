import java.util.Scanner;

public class Automatic_Teller_Machine {

    public static String greeting(String userName) {

        return "Welcome " + " " + userName;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int MINIMUM_BALANCE = 500;
        final int ATM_PIN = 1234;
        int moneyInAccount = 10000;

        System.out.println("Welcome to Indian Bank");
        System.out.print("Enter Your Name:");
        String userName = scan.nextLine();
        String message = greeting(userName);
        System.out.println(message);
        System.out.print("Enter Your Pin:");
        int pin = scan.nextInt();

        if (pin != ATM_PIN) {
            System.out.println("Invalid Pin");
            
            // System.out.println("If you want to reset the password enter 1 and to try
            // again enter 2");
            // int passwordUserOption = scan.nextInt();

            // if(passwordUserOption == 1){
            // ATM_PIN = resetPassword();
            // }
        }
            else{
  int choice;
            

        
      
        do {

            System.out.println("1. Deposite.");
            System.out.println("2. Withdraw.");
            System.out.println("3. Balance Check.");
            System.out.println("4. Exit.");

            System.out.print("Enter The Choice:");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You can able only 50000 only at a time");
                    System.out.print("Enter the amount: ");
                    int userDeposite = scan.nextInt();
                    int AMOUNT_DEPOSITE_LIMIT = 50000;

                    if (AMOUNT_DEPOSITE_LIMIT >= userDeposite) {

                        moneyInAccount = moneyInAccount + userDeposite;
                        System.out.println("======================================================");

                        System.out.println("Your Amount Suscessful Deposite!!");

                        System.out.println("Balance" + " " + moneyInAccount);
                        System.out.println("======================================================");

                        break;

                    }
                case 2:
                    System.out.print("Enter Your Amount:");

                    int withdrawalAmount = scan.nextInt();

                    if (withdrawalAmount >= moneyInAccount) {

                        System.out.println("======================================================");

                        System.out.println("Invalid");

                        System.out.println("Your Balance is:" + moneyInAccount);
                        System.out.println("======================================================");

                    } else if (withdrawalAmount <= moneyInAccount - MINIMUM_BALANCE) {

                        moneyInAccount = moneyInAccount - withdrawalAmount;
                        System.out.println("======================================================");
                        System.out.println("Your Amount Suscessful Withdrawal!!");
                        System.out.println("Your Balance is:" + moneyInAccount);
                        System.out.println("======================================================");

                    } else {
                        System.out.println("======================================================");

                        System.out.println("You need to Maintain minimum balance of " + MINIMUM_BALANCE);
                        System.out.println("======================================================");

                    }
                    break;

                case 3:
                    System.out.println("======================================================");

                    System.out.println("Your Balance Is" + " " + moneyInAccount);
                    System.out.println("======================================================");

                    break;

                case 4:
                    System.out.println("======================================================");

                    System.out.println("ThankYou" + " " + userName + " " + "Have a Nice Day!!");
                    System.out.println("======================================================");

                    break;

                default:
                    System.out.println("======================================================");

                    System.out.println("Invalid Choice! Please select 1-4.");
                    System.out.println("======================================================");

                    break;
            }
        } while (choice != 4);
        scan.close();
    }
}
}