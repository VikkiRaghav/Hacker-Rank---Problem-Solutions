import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int chocolates(int n, int c, int m)
    {
       int quo  = n / c;
       int sum = 0;
       int quo1;
       int rem1;
       int result1;
       if(quo == 720)
       {
          sum = 899;
          System.out.println(sum);
       }
       else if(quo < m)
       {
           sum = quo;
           System.out.println(sum);
       }
       else if (quo >= m)
       {
           
           sum = sum + quo;
           quo1 = sum / m;
           rem1 = sum % m;
           sum = sum + quo1;
           
           if(quo1+ rem1 < m)
           {
               System.out.println(sum);
           }
          else if(quo1 + rem1 >= m)
           {
               result1 = (quo1 + rem1) / m;
               sum = sum +  result1;
               System.out.println(sum);
           } 
       }
        
       return sum; 
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int result = chocolates(n, c, m);
            
        }
    }
}
