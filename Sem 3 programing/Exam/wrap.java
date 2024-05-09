public class wrap {
    public static void main(String[] args) {
        int i = 100;
        Integer io = new Integer(i); //Boxing
        Integer ioo = i; //AutoBoxing
        Integer io1 = Integer.valueOf(i); 
        System.out.println(i+"  " +ioo +" " + io1);
        int au = io1;
        int au1 = io.intValue(); 
        System.out.println(au);
    }
}
