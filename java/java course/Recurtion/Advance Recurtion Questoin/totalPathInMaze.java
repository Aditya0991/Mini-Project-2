public class totalPathInMaze {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int totalPath = calcpath(0, 0, m, n);
        System.out.println(totalPath);
    }
    public static int calcpath(int i,int j ,int m,int n){
        if(i ==n || i == m){
            return 0;
        }
        if(i == m-1 && j == n-1){
            return 1;
        }
        // Move downward
        int down = calcpath(i+1, j, m, n);
        // Move right
        int right = calcpath(i, j+1, m, n);
        return down + right;
    }
}
