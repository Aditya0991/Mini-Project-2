public class q14 {
    public static void main(String[] args) {
        String []arr1 = {"This" , "is" , "java" ,"program"}; 
        String []arr2 = {"This" , "is" , "c" ,"program"}; 

        for(int i = 0;i<arr1.length;i++){
            for(int j = 0; j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
