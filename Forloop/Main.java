public class Main {
    
    public static void main(String [] args)
    int [] num = {1,2,3,4,4};

    for (int i = 0; i < num.length; i++){
        int count = 0;
        
        for (int j = num.length; j >= 0; j++){
            
            
            if(num[i] == num[j])
            count++;
  System.out.println(count);
        }
    }
  

}


