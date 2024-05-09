public class q16 {
    public static void main(String[] args) {
        int dup = 0,idx = 0;
        int []arr = {1,4,5,8,5,4};
        for(int i = 0; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    dup = arr[i];
                }
            }
        }
        for (int i = 0 ;i<arr.length ; i++){
            idx = idx + 1;
            if(arr[i] == dup){
                break;
            }
            
        }

        for(int i = idx ; i <arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        System.out.println("Duplicate element at index " +idx);
        System.out.println("Duplicate :  " + dup);
        for(int i = 0;i<arr.length ;i++){
            System.out.print(arr[i]);
            System.out.print("\t");
            
        }
    }
}
