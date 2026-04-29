package lab1;

enum Type{
    Deposit,
    Debit
}

public class BankAccount {
    // final modifier
    private final int number;

    public int balance;
    Type type;

    // static modifier
    static final String bankName = "Kaspi";

    // initialization block
    static {
        System.out.println("Bank Account is " +  bankName);
    }

    public BankAccount(int number, Type type) {
        // first this
        this.number = number;
        this.type = type;
    }

    public void addMoney(int money){
        balance += money;
    }

    public void sendMoney(int amount) {
        if (type == Type.Debit &&  balance >= amount) {
            System.out.println("You send money " + amount);
            this.balance -= amount;
        } else {
            System.out.println("Your account is deposit card or you don't have enough money");
        }
    }
    // Overloading
    public void sendMoney(int amount, String note){
        if(type == Type.Debit &&  balance >= amount){
            // second this
            this.balance -= amount;
            System.out.println(amount);
            System.out.println(note);
        } else{
            System.out.println("Your account is deposit card or you don't have enough money");
        }
    }


    // read-only fields
    public void getTypeOfAccount(){
        System.out.println("Your type of account is "+type);
    }

    public int getNumber(){
        return number;
    }

    public void getBalance(){
        System.out.println("Your balance is "+balance);
    }

}
