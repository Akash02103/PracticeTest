/*Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and 
implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount
 class and call both the "deposit" and "withdraw" methods.*/

 interface BankAccount 
 {
    void deposit(double amount);
    void withdraw(double amount);
 }
 class CheckingAccount implements BankAccount
 {
    double balance;

    public void deposit(double amount)
    {
        System.out.println("this is deposit method");
        balance += amount;
    }

    public void withdraw(double amount)
    {
        System.out.println("this is withdraw method");
        if (balance >= amount) { // Check if there is enough balance to withdraw
            balance -= amount; // Subtract the withdrawal amount from the balance
        } else {
            System.out.println("Insufficient balance."); // Print an error message if there is not enough balance
        }
    }
    // Add a getter method to retrieve the current balance
    public double getBalance() {
        return balance;
    }
 }

 class Main1
 {
    public static void main(String args[])
    {
        CheckingAccount obj=new CheckingAccount();
        obj.deposit(100);
        obj.withdraw(50);
        System.out.println(obj.getBalance());
    }
 }
