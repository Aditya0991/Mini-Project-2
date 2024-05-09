public class sumNum {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        do{
            sum += num;
            num++;
        }while(num <= 100);
        System.out.println(sum);
    }
}
