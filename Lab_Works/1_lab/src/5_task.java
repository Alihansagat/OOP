import java.util.Scanner;

class Savings{
    public static void main(String[] args){
        double balance = 100000;
        double rate = 0.2;

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month == 6){
            double newBalance = balance;
            for(int i = 1; i <= month; i++){
                newBalance += newBalance * rate;
            }
            System.out.println("Your balance in 6 months will be = " + newBalance);
        } else if (month == 12) {
            double newBalance = balance;
            for(int i = 1; i <= month; i++){
                newBalance += newBalance * rate;
            }
            System.out.println("Your balance in 12 months will be = " + newBalance);
        }
    }
}