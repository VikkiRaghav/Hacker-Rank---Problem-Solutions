import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static String encryption(String s) {
       String sa = "sa";
       StringBuilder sb = new StringBuilder();
       int len = s.length();
       double sqrt = Math.sqrt(len);
       double ceil = Math.ceil(sqrt);
       int no =(int)ceil;
    
       for(int i=0; i<no;i++)
       {
           for(int j=i;j<len;j=j+no)
           {
               char ch = s.charAt(j);
               sb.append(ch);
               
           }
           sb.append(" ");
       }
      System.out.println(sb);
      return sa;
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = encryption(s);
        in.close();
    }
}