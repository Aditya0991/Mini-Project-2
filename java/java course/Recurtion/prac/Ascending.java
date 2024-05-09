public class Ascending {
    public static void main(String[] args) {
        int num = 0;
        PrintAscending(num);
    }
    public static void PrintAscending(int num){
        if(num == 5){
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        PrintAscending(num+1);
    }
}
