// 10.Given a string "Java@123", check whether the string contains only letters and numbers using an appropriate String method.

public class Onlyletter {
    public static void main(String[] args) {
        String email = "Java@123";
        char[] arr = email.toCharArray();
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {

            if (Character.isLetterOrDigit(arr[i])) {
                result = true;

            } else {
                result = false;
                break;

            }
           
        }
 System.out.println(result);
    }

}
