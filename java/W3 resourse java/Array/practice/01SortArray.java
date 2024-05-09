import java.util.Arrays;

public class SortArray{
    public static void main(String[] args) {
        String []arrOfString = {"abc" , "aasdfs"};
        int []arrOfNumber = {6,2,8,9,1};
        Arrays.sort(arrOfNumber);
        Arrays.sort(arrOfString);
        System.out.println(Arrays.toString(arrOfNumber));
        System.out.println(Arrays.toString(arrOfString));
    }
    

}