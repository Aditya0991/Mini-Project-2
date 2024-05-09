import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class Q38 {
    public static void main(String[] args){
        String rev = "";
        int letter = 0,space = 0,number = 0 ,other =0;
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        System.out.println(st);
        int len = st.length();
        for(int i = 0; i<len ; i++){
            // System.out.println(st.charAt(i));
            if (st.charAt(i)>='a' && st.charAt(i)<='z' || st.charAt(i)>='A' && st.charAt(i)<='Z'){
                letter+=1;
            }
            else if(st.charAt(i) == ' '){
                space+=1;
            }
            else if(i >= 0 || i <= 9){
                number += 1;
            }
            else{
                other +=1;
            }
        }
        System.out.printf("letter %d space %d number %d other %d",letter,space,number,other);
        // System.out.println(letter);
    }
}
