package lab2.problem3;

import java.util.Vector;

public class Bank {
    Vector<Account> accounts = new Vector<>();

    public void openAccount(Account a){
        accounts.add(a);
    }

    public void closeAccount(int accNumber){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getAccountNumber() == accNumber){
                accounts.remove(i);
                break;
            }
        }
    }

    public void update(){
        for(Account a : accounts){
            if(a instanceof SavingsAccount){
                ((SavingsAccount)a).addInterest();
            }
            if(a instanceof CheckingAccount){
                ((CheckingAccount)a).deductFee();
            }
        }
    }

    public void printAccounts(){
        for(Account a : accounts){
            a.print();
        }
    }
}
