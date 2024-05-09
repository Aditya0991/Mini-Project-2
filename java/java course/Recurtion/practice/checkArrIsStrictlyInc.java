public class checkArrIsStrictlyInc {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5};
        Boolean o = checkarr(arr, 0);
        System.out.println(o);
    }
    public static Boolean checkarr(int arr[] , int idx){
        if(arr.length - 1 == idx){
            return true;
        }
        if(arr[idx] < arr [idx+1]){
            return checkarr(arr, idx+1);
        }
        else{
            return false;
        }
        
    }
}
