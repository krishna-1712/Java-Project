//4.Given a string "Java Programming", extract "Programming" using a String method.

public class Extract{
    public static void main(String[] args){
        String name = "Java Programming";
        String name2 = "Programming";
        int result =name.indexOf(name2);
        String result2 = name.substring(result);
System.out.println(result2);
        
    }
}