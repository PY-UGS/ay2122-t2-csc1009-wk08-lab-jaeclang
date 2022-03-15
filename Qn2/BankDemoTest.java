package Qn2;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args){
        CheckingAccount myAccount = new CheckingAccount(696911);
        try(Scanner scan = new Scanner(System.in)) {
            while(myAccount.getBalance() == 0){
                System.out.println("Enter the amount for your Initial Deposit: $");
                double amt_to_deposit = scan.nextDouble();
                myAccount.deposit(amt_to_deposit);
            }

            try {
                System.out.println("Enter the amount to withdraw: $");
                double amt_to_withdraw = scan.nextDouble();
                myAccount.withdraw(amt_to_withdraw);
                System.out.print("The Balance after Withdrawal is: $" + myAccount.getBalance());

            } catch(InsufficientFundsException e) {
                System.out.println("Sorry, but your account is short by: $" + e.getAmount());
                e.printStackTrace();
            }
        }
    }
}
