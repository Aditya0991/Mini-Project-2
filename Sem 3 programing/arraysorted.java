public class arraysorted {
    public static void main(String[] args) {
        int x = 5;
        int []arr = {1,2,3,4,5,6};
        int i = 0;
        int j = arr.length;
        while (i < j){
            for(int k = 0 ; k < j ;k++){
                if(arr[k] == x || arr[arr.length-k-1] == x){
                    System.out.println(k);
                }  
                j = arr.length/2;
                i++;
        }
        }
    }
}
