

public class triversing {
     public static void main(String[] args) {
        int i; 
        int []marks = {90,98,96,94,93};
        // System.out.println(marks[3]);
        // for(i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }
        // Element of array in reverse order
        for(i=marks.length-1 ; i>=0 ; i--){
            System.out.println(marks[i]);
        }
     }
}
