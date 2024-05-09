class Details{
    int Account_Number;
    String Name;
    int Balance;
    int Phone_Number;
    
     
    public void deposit(int amt) {
        System.out.println("Account Number : " + Account_Number);
        System.out.println("Name : " + Name);
        System.out.println("Phone Number : " + Phone_Number);
        System.out.println("Current Balance After Deposit : " + (amt+Balance));
               
    }
    public void withdrawal(int amt){
        System.out.println("Account Number : " + Account_Number);
        System.out.println("Name : " + Name);
        System.out.println("Phone Number : " + Phone_Number);
        System.out.println("Current Balance After withdrawal : " + (Balance-amt));
    }

}
public class bank{
    public static void main(String[] args){
        Details Customer = new Details();
        Customer.Account_Number = 1234567890;
        Customer.Name = "Aditya";
        Customer.Balance = 1000000000;
        Customer.Phone_Number = 5555555;
        Customer.deposit(12345);

       
    }
}