public class temp {
 
    public static int countPaths(int i, int j, int m, int n) {
        if(i == m-1 || j == n-1) {
            return 1;
        }
        // dowm
        int down =countPaths(i+1, j, m, n);
        // right
        int right = countPaths(i, j+1, m, n);
        return  down + right ;
    }
  
    public static void main(String args[]) {
        int m = 3, n = 3;
        System.out.println(countPaths(0, 0, m, n));
    }
 }
 