public class HCF {
    public static void main(String[] args) {
        int a = 300;
        int b = 20;
        int temp = 0;
        do{
            if(a > b){
                temp = b;
                for(int i = temp; i > 0 ;i--){
                    if(a%i ==0 && b %i ==0){
                        System.out.println(i);
                        break;
                    }
                }
            }
            else{
                temp = a;
                for(int i = temp; i > 0 ;i--){
                    if(a%i ==0 && b %i ==0){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }while(false);
    }
}
