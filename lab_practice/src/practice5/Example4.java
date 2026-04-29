package practice5;

import java.util.*;

public class Example4
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String expr = in.nextLine();

      try
      {
         char operator = ' ';

         if (expr.contains("+")) operator = '+';
         else if (expr.contains("-")) operator = '-';
         else if (expr.contains("*")) operator = '*';
         else if (expr.contains("/")) operator = '/';

         String[] parts = expr.split("\\" + operator);

         double left = Double.parseDouble(parts[0]);
         double right = Double.parseDouble(parts[1]);

         double result = 0;

         switch (operator)
         {
            case '+': result = left + right; break;
            case '-': result = left - right; break;
            case '*': result = left * right; break;
            case '/': result = left / right; break;
         }

         System.out.println("Result: " + result);
      }
      catch (Exception e)
      {
         System.out.println("Invalid input");
      }
   }
}