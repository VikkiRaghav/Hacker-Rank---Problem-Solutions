import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String biggerIsGreater(String w) {
        char [] ch = w.toCharArray();
        int len = ch.length;
        int pos = 0;
        int pos1 = 0;
        
        for(int i = len-1; i>0; i--)
        {
            if(ch[i-1] < ch[i])
            {
                pos = i-1;
                break;
            }
        }
       for(int j=len-1; j>pos; j--)
       {
           if(ch[j] > ch[pos])
           {
               pos1 = j;
               break;
           }
       }
        if(pos == 0 && pos1 == 0)
          return "no answer";
        
        char temp = ch[pos];
        ch[pos] = ch[pos1];
        ch[pos1] = temp;
        
        if(pos < len-1)
            return reverseStr(ch,pos+1,len-1);
        
        return "no answer";
    }
    public static String reverseStr(char ch[],int start, int end)
    {
        while(start < end)
        {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            String w = in.next();
            String result = biggerIsGreater(w);
            System.out.println(result);
        }
        in.close();
    }
}
