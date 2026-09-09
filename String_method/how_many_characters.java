// 3.Given a string "Java is easy to learn", count how many characters are present excluding spaces
public class how_many_characters {
    public static void main(String[] args) {
        String name = "Java is easy to learn";
        char[] arr = name.toCharArray();
        int count = 0;
        for (int i = 0; i <= arr.length-1; i++) {

            if (arr[i] != ' ') {
                count = count + 1;

            }

        }
        System.out.println(count);

    }

}
