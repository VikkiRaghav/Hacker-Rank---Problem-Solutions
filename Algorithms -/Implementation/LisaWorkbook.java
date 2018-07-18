import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static int workbook(int n, int k, int[] arr) {
      
       int page=1;
       int count=0;
       
       for(int i=0; i<n; i++)
      {
          for(int j=1; j<=arr[i]; j++)
          {
              if(j == page)
              {
                  count++;
              }
              if(j == arr[i] || (j % k ==0))
              {
                  page++;
              }
          }
      }
       return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = workbook(n, k, arr);
        System.out.println(result);
        in.close();
    }
}