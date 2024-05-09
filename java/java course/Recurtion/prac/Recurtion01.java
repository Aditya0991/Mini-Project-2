public class recurtion01 {
    public static void main(String[] args) {
        int num = 5;
        PrintNum(num);
    }
    public static void PrintNum(int num ){
        if(num == 0){
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        PrintNum(num -1 );
    }
}
