public class Replace_0s_with_5s {
    public static void main(String[] args) {
        int o = convertfiveRec(120035);
        System.out.println(o);
        int lar = Integer.MAX_VALUE;
    }
    public static int convertfiveRec(int num) {
            // Base case for recursion termination
            if (num == 0) return 0;
    
            // Extract the last digit and change it if needed
            int digit = num % 10;
            if (digit == 0) digit = 5;
    
            // Convert remaining digits and append the last digit
            return convertfiveRec(num / 10) * 10 + digit;
        }
        int convertfive(int num) {
            if (num == 0)
                return 5;
            else
                return convertfiveRec(num);
        }
    }

