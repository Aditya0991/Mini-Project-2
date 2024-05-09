public class string {
    public static void main(String[] args) {
        String st = "Aditya";
        String st1 = new String("Riyansh");
        System.out.println(st.concat(st1));
        StringBuffer s = new StringBuffer("Aditya");
        s.append(st);
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        
    }
}
