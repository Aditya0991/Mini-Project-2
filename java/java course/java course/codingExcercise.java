public class codingExcercise {
    public static void main(String[] args){
        checknumber(-1);
    }
    public static void checknumber(int number){
        if(number >0 ){
            System.out.println("positive");
        }
        else if(number<0){
            System.out.println("negative");
        }
        else if (number == 0){
            System.out.println("zero");
        }
        System.out.println(Math.round(3.8));
    }
}
