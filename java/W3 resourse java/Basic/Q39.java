// public class Q39 {
//     public static void main(String[] args){
//         int amt = 0;
//         for (int i=0;i<=4;i++){
//             for (int j=0;j<=4;j++){
//                 for (int k=0;k<=4;k++){
//                     if (k!=i && k!=j && i!=j){
//                         amt++;
//                         System.out.printf(i +""+j+""+k+"\t");
//                     }
//                 }
//             }
//         }
//         System.out.println("Total no. of three digit number are "+ amt);
//     }
// }
import java.util.Scanner;

public class Q39 {
    
 public static void main(String[] args) {
		int amount = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);
	}
}
