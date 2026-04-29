import java.util.Scanner;

class Calculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double area = a * a;
        double perimeter = a * 4;
        double dioganal = a * Math.sqrt(2);
        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Dioganal is = " + dioganal);
    }
}