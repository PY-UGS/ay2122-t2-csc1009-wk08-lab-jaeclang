package Qn2;

import javax.print.attribute.IntegerSyntax;

public class CheckingAccount extends Exception{
    private double balance;
    private final int bank_num;

    public CheckingAccount(int bank_num){
        this.bank_num = bank_num;
    }

    public void deposit(double amt_to_deposit){
        if (amt_to_deposit > 0) {
            balance += amt_to_deposit;
        }
        else{
            System.out.println("Amount to deposit cannot be less than equal to 0!");
        }
    }
    public void withdraw(double amt_to_deduct) throws InsufficientFundsException {
        if(amt_to_deduct <= balance){
            balance -= amt_to_deduct;
        }
        else{
            double deficit = amt_to_deduct - balance;
            throw new InsufficientFundsException(deficit);
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public double getNumber(){
        return this.bank_num;
    }
}
