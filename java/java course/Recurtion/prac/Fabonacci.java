import javax.xml.transform.Source;

public class fabonacci {
    public static void main(String[] args) {
        int terms = 10;
        int a = 0;
        int b = 1;
        int i = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        PrintFabonacci(a, b, terms - 2, i);
    }
    public static void PrintFabonacci(int a , int b, int terms , int i){
        if(terms == i){
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        PrintFabonacci(b, c, terms, i+1);
    }
}
