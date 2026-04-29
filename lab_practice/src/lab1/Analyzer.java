package lab1;

import java.util.Scanner;

public class Analyzer {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data data = new Data();

        while(true){
            System.out.println("Enter number (Q to quit): ");
            String s = input.next();

            if(s.equals("Q")){
                break;
            }

            try {
                double v = Double.parseDouble(s);
                data.add(v);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Average = " + data.getAvg());
        System.out.println("Maximum = " + data.getMax());
    }
}
