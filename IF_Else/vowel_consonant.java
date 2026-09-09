public class vowel_consonant {
    public static void main(String[] args) {
        char name = 'p';
        char[] arr = { 'a', 'e', 'i', 'o', 'u' };
        String result = "Its a consonant";
        for (char i = 0; i < arr.length; i++) {

            if (name == arr[i]) {
                result = "Its a Vowels";
                break;
            }

        }
        System.out.println(result);
    }

}