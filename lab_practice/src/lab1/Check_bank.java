package lab1;

class bank{
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(453252, Type.Deposit);
        BankAccount acc2 = new BankAccount(324552, Type.Debit);

        acc1.addMoney(5000);
        acc1.sendMoney(200);
        acc1.getBalance();
        acc1.getTypeOfAccount();
        System.out.println(acc1.getNumber());


        acc2.sendMoney(5000);
        acc2.addMoney(8000);
        acc2.sendMoney(500, "Thank you!");
        acc2.sendMoney(200);
        acc2.getBalance();
        acc2.getTypeOfAccount();


    }
}