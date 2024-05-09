import javax.lang.model.element.Element;

class binaryser{
    public static void main(String[] args) {
        int arr[] = {1,4,7,10,21,33};
        int x = 33;
        int low,mid,high;
        low =0;
        high = arr.length;
        for(int i = 0 ; i < arr.length; i++){
            mid = (low + high)/2;
            if(arr[mid] == x){
                System.out.println(mid);
            }
            if(arr[mid] < x){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
    }
}