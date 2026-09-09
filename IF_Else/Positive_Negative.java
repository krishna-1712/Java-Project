 import java.util.Scanner;
public class Positive_Negative{
    public static void main(String[] args) {
        System.out.println("Enter the number");
Scanner scan = new Scanner(System.in);
int a =scan.nextInt();
if(a>0){
    System.out.println("is a positive number");
}
else if(a<0){
     System.out.println("is a neagative number");
}
else{
     System.out.println("is a Neutral");
     scan.close();
}
}
}
