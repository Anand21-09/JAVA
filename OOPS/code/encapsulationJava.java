
class bankAccount {

    private double balance;
    private String accountNumber;

    bankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Enter a valid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Balance after withdrawaing the amount " + amount + " is : " + balance);
        } else {
            System.out.println("You dont have money mf");
        }
    }
}

public class encapsulationJava {

    public static void main(String[] args) {
        bankAccount myAcc = new bankAccount(1000, "123456");
        System.out.println("Account number : " + myAcc.getAccountNumber());
        myAcc.deposit(500);
        System.out.println("Balance : " + myAcc.getBalance());
    }
}
