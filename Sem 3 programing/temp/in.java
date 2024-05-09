public class in {
    public static void main(String[] args) {
        {
            int arr[] = {1,2,3,4};
            int n = 4;
            int mod = 1;
            //yout code here\
            long pro = 1;
            for(int i = 0 ; i < n ; i++){
                pro *= arr[i];
            }
            System.out.println(pro);
            long rem;
            rem =  pro % mod;
            System.out.println(rem);
        }
    }
}
