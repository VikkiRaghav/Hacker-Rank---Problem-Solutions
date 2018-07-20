import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the strangeCounter function below.
     */
   public static long strangeCounter(long t) {
        if(t==1)
            return 3;
       if(t==2)
           return 2;
       if(t==3)
           return 1;
       long initial = 3;
       long i = 1;
       long result = -1;
      
       while(true)
       {
           long no1 = initial + (i * 6);
           if(no1 == t)
           {
               result = 1;
                break;
           }
           
           else if(initial < t && no1 > t)
           {
               System.out.println(initial + " " + no1);
               long diff = no1-t;
               result = diff + 1;
               break;
           }
           initial = no1;
           i = i*2;
      
           
           
       }
           return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
