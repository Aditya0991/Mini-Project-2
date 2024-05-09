public class q1 {
    public static void main(String[] args){
        LargestNumber(3, 1, 7);
    }

    public static void LargestNumber(int a, int b, int c){
        if(a>b && a>c){
            System.out.printf("Number %d is largest" , a);
        }
        else if(b>c && b>a){
            System.out.printf("Number %d is largest" , b);
        }
        else{
            System.out.printf("Number %d is largest" , c);
        }

    }
}
