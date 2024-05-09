public class GenericMethod {
    public <E> void printArray(E []s){
        for(E i:s){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4};
        String str[] = {"a" ,"b" ,"c"};
        GenericMethod g1 = new GenericMethod();
        g1.printArray(str);
    }
}
