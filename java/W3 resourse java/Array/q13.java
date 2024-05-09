public class q13 {
    public static void main(String[] args) {
        String []arr  = new String[10];
        arr[0] = "Hello";
        arr[1] = "Hjndg";
        arr[2] = "dfs";
        arr[3] = "fjksdn";
        arr[4] = "Hjndg";
        for(int i = 0 ;i<arr.length ; i++){
            for(int j = i+1 ;j<5 ; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
