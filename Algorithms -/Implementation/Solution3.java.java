import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long taumBday(long b, long w, long x, long y, long z) {
       Set<Long> set1 = new HashSet<Long>();
       Set<Long> set2 = new HashSet<Long>();
       set1.add(x);
       set1.add(y+z);
       set2.add(y);
       set2.add(x+z);
       Object obj1 = Collections.min(set1);
       Object obj2 = Collections.min(set2);
       long i= (long) obj1;
       long j = (long) obj2;
       long total = (b * i) + (w * j);
       System.out.println(total);
       return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long result = taumBday(b, w, x, y, z);
           
        }
        in.close();
    }
}
