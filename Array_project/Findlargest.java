public class Findlargest {
    public static void main(String[] args) {
        int[] arr = { 103, 500, 560, 700, 800 };
        int count = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count)
                count = arr[i];

           
        }
         System.out.println("Greatest number is:"   +  count);
    }

}