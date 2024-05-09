public class method01 {
    public static void main(String[] args) {
        long miles = method01.toMilePerHour(312.85);
        System.out.println("miles");
    }

    public  long toMilePerHour(double kilometerPerHour){
        if (kilometerPerHour < 0){
            System.out.println("Invalid value");
            return -1;
        }
        
        return Math.round(kilometerPerHour/1.609344);
        
       
    }

    

}