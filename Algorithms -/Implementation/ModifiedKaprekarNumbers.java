import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {
    public static int Kaprekar(int a, int b)
    {
        
        int count = 0;
        
        for(int i=a; i<=b; i++)
        {
            BigInteger result = BigInteger.valueOf(i).multiply(BigInteger.valueOf(i));
            int no = i * i;
            if(no == 1)
            {
              System.out.print(i + " ");
            }
            
            if(no == 4 || no == 9)
            {
                continue;
            }
            else 
            {
            
            String s = String.valueOf(result);
            int mid = s.length()/2;
            String sub1 = s.substring(0,mid);
            String test = s.substring(mid,mid+1);
            int footer = Integer.parseInt(test);
            String sub2 = s.substring(mid,s.length());
            try{
             long foo1 = Long.parseLong(sub1);
             long foo2 = Long.parseLong(sub2);
             
                if(foo1 + foo2 == i)
                {
                   System.out.print(i + " ");
                   count++;
                }
            }catch(NumberFormatException e)
            {
                
            }
         
            
        }
        
        }
        if(count == 0)
        {
            System.out.println("INVALID RANGE");
        }

    return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = Kaprekar(a,b);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}