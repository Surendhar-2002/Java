package Practice;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super(message);
    }
}

class BankAccount{

    private double balance;

    public BankAccount(double intialBalance){
        this.balance=intialBalance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositcsuccesful");
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficeint funds");
        }
        balance -= amount;
        System.out.println("withdraw succesful");
    }

    public void checkBalance(){
        System.out.println("Balance is: "+balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);
        int option;
        double depositAmount,withdrawAmount;

         while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            option =sc.nextInt();

            switch (option) {
                case 1:
                     System.out.print("Enter amount to deposit: ");
                     depositAmount=sc.nextDouble(); 
                     account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                     withdrawAmount = sc.nextDouble();
                     try{
                        account.withdraw(withdrawAmount);
                     }catch(InsufficientBalanceException e){
                        System.out.println(e.getMessage());
                     }
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank App!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
         }
    }
}
