import java.util.Scanner;

class Polindrome{
    public static boolean isPolindrome(String s){
            int l = 0;
            int r = s.length() - 1;
            while(l < r){
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isPolindrome(s)) {
            System.out.println(s + " is a polindrome!");
        } else {
            System.out.println(s + " is not a polindrome!");
        }
    }
}