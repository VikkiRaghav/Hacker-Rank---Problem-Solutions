import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void stones(int n, int a, int b) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = n-1;
        int j = 0;
        Iterator al = set.iterator();
        while(i >= 0 && j <= n-1)
        {
            int sum = (a * i) + (b * j);
            list.add(sum);
            i--;
            j++;
        }
        set.addAll(list);
        list.clear();
        list.addAll(set);
        int size = list.size();
        for(int k=0; k<size; k++)
        {
        int val = list.get(k);
        System.out.print(val + " ");
        }
        
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            stones(n, a, b);
            System.out.println(" ");
}
        in.close();
    }
}