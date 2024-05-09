import java.util.Arrays;

public class temp{
    public static void main(String[] args) {
          //add code here.
          int []a = {111,222,454};
          boolean []arr = new boolean[a.length];
          for(int i = 0 ; i < a.length ; i++){
              int num = a[i];
              int rev = 0;
              while(num > 0){
                  int r = num % 10;
                  rev = rev * 10 + r;
                  num = num /10;
              }
              System.out.println(rev);
              if(a[i] == rev){
                  arr[i] = true;
              }
              
          }
          System.out.println(Arrays.toString(arr));
          System.out.println();
    }
}