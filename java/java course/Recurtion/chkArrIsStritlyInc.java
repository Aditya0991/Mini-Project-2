public class chkArrIsStritlyInc {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5};
        Boolean b = checkArray(arr, 0);
        System.out.println(b);
    }
    public static Boolean checkArray(int arr[] , int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return checkArray(arr, idx+1);
        }
        else {
            return false;
        }    
    }
}
