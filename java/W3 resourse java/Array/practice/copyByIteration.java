import java.util.Arrays;

import javax.naming.ldap.ManageReferralControl;

public class copyByIteration {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int []arr1 = new int[arr.length];
        for(int i = 0 ; i < arr.length ;i ++){
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
