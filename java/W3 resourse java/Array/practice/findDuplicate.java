public class findDuplicate {
    public static void main(String[] args) {
        int []arr = {1,5,2,7,5,1};
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if((arr[i] == arr[j])&&(i != j)){
                    System.out.println(arr[i]);
                } 
            }
            
        }
        
    }
}
