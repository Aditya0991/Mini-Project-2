public class Q39 {
    public static void main(String[] args){
        int amt = 0;
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                for (int k=0;k<=4;k++){
                    if (k!=i && k!=j && i!=j){
                        amt++;
                        System.out.printf(i +""+j+""+k+"\t");
                    }
                }
            }
        }
        System.out.println("Total no. of three digit number are "+ amt);
    }
}
#Wrong