public class facbonacc {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int term = 9;
        System.out.print(a + " ");
        System.out.print(b + " ");
        printSeries(a, b, term -2, 0);
    }
    public static void printSeries(int a ,int b , int term ,int idx){
        if(idx == term){
            return;
        }
        
        int c = a + b;
        
        System.out.print(c + " ");
        printSeries(b, c, term, idx+1);
    }
}
