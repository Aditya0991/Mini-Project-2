public class temp21_22MethodOverloading {
    public static int sum(int a ,int b) {
        int s = 0;
        for(int i = a ; i <= b ;i++){
            if(i % 2 ==0){
                s += i;
            }
        }
        return s;
    }
    public static int sum(int a){
        
        int tot = 0;
        while(a >0){
        
        int r  = a % 10;
        if(r % 2 != 0){
            tot += r;
        }
         a = a/10;
         
    }
    return tot;
    }
    public static void main(String[] args) {
        temp21_22MethodOverloading t1 =new temp21_22MethodOverloading();
       System.out.println(t1.sum(123));
       System.out.println(t1.sum(1,2));
       
        
    }
}
