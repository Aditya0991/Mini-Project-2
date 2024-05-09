public class x_Pow_n {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(cal(5));
    }
    public static int cal(int n){
        
        int out = cal(n-1);
        return out;
    }
}
