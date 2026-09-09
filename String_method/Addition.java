// 12.how many a and how many b and how many c and calculate the output

public class Addition {
    public static void main(String[] args) {
        
        String name = "aabbbcc";
        char[] result = name.toCharArray();
        int countA = 0;
        int countB = 0;
        int countC = 0;

        for (int i = 0; i < result.length; i++) {

            if (result[i] == 'a') {
                countA++;

            } else if (result[i] == 'b') {
                countB++;
            } else if (result[i] == 'c') {
                countC++;
            }
        }


        System.out.println("a:" + countA);
        System.out.println("b:" +countB);
        System.out.println("c:" +countC);

    }




}
