public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int o = calfact(n);
        System.out.println(o);
    }
    public static int calfact(int n){
        if(n == 0 || n == 1 ){
            return 1;
        }
        int out = n *calfact(n-1);
        return out;
    }
}
