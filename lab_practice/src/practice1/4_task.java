import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double d = b * b - 4 * a * c;
        if(d < 0){
            System.out.println("Error, discriminant can't be negative");
        }
        else {
            double sqrtD = Math.sqrt(d);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}