public class q8 {
    public static void main(String[] args){
        int []arr1 = {1,2,96,67,45};
        int []arr2 = new int[5];
        for(int i = 0;i< arr1.length ; i++){
            arr2[i] = arr1[i];
        }

        System.out.println("Element of arr2 : ");
        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
