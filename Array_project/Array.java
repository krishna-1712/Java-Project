public class Array {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 4};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;


            for (int j = arr.length-1; j >= 0; j--) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            

        } 

    }
}