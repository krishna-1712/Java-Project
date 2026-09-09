// 9.Given a string "HELLO java", convert the entire string into lowercase and check whether it equals "hello java".
public class Lowercase {
    public static void main(String[] args) {
        String name = "HELLO java";
        String name2 = "hello java";
        String lower = name.toLowerCase();
        boolean result = name2.equals(lower);
        System.out.println(result);
    }

}
