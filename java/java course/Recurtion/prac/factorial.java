public class factorial {
    public static void main(String[] args) {
        int num = 7;
        int  o = CalcFact(num);
        System.out.println(o);
    }
    public static int CalcFact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        int out = num * CalcFact(num - 1);
        return out;
    }
}
