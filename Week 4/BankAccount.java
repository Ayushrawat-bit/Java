public class BankAccount {
    public static void main(String[] args) {

        Account acc1 = new Account("A001", "Alice");
        Account acc2 = new Account("A002", "Bob", 100.0);

        System.out.println("Deposit positive: " + acc1.deposit(50));   
        System.out.println("Deposit zero: " + acc1.deposit(0));        
        System.out.println("Deposit negative: " + acc1.deposit(-10));  

        System.out.println("Withdraw valid: " + acc2.withdraw(40));    
        System.out.println("Withdraw excessive: " + acc2.withdraw(200)); 

        System.out.println(acc1);
        System.out.println(acc2);
    }
}
