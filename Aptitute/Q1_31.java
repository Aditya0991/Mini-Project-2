public class Q1_31 {
    public static void main(String[] args) {
        int arr[] = {1,6,3,2,5,3};
        int temp[] = new int[arr.length];
        int visited = -1;
        for(int i = 0  ; i < arr.length ; i++){
            int count = 1;
            for(int j = i+1 ; j < arr.length;j++){
                if(arr[i]  == arr[j]){
                    count++;
                    temp[j] = visited;
                }
                if(temp[i] != visited){
                    temp[i] = count;
                }
            }
        }
        for(int i = 0; i < temp.length; i++){  
            if(temp[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + temp[i]);  
        }  
    }
}
