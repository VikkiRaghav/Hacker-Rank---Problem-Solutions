import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int timeInWords(int h, int m) {
       String hour = getValueFromHashMap(h);
        if(m == 0)
        {
            String res = hour+" "+"o\'"+ " "+"clock";
            System.out.println(res);
        }
       if(m > 0 && m <= 30)
       {
           String minute = getFirst(m);
           String res = minute +" " + "past" + " " + hour;
           System.out.println(res);
       }
        if(m >= 31 && m < 60)
        {
            String minute = getSecond(m);
            String res = minute +" " + "to" + " " + hour;
            System.out.println(res);
        }
       return 1;
    }
    public static String getSecond(int m)
    {
        Map<Integer,String> map = new HashMap<Integer,String>();
           map.put(31,"twenty nine minutes");
           map.put(32,"twenty eight minutes");
           map.put(33,"twenty seven minutes");
           map.put(34,"twenty six minutes");
           map.put(35,"twenty five minutes");
           map.put(36,"twenty four minutes");
           map.put(37,"twenty three minutes");
           map.put(38,"twenty two minutes");
           map.put(39,"twenty one minutes");
           map.put(40,"twenty minutes");
           map.put(41,"nineteen minutes");
           map.put(42,"eighteen minutes");
           map.put(43,"seventeen minutes");
           map.put(44,"sixteen minutes");
           map.put(45,"quarter");
           map.put(46,"fourteen minutes");
           map.put(47,"thirteen minutes");
           map.put(48,"twelve minutes");
           map.put(49,"eleven minutes");
           map.put(50,"ten minutes");
           map.put(51,"nine minutes");
           map.put(52,"eight minutes");
           map.put(53,"seven minutes");
           map.put(54,"six minutes");
           map.put(55,"five minutes");
           map.put(56,"four minutes");
           map.put(57,"three minutes");
           map.put(58,"two minutes");
           map.put(59,"one minute");
           Object val = map.get(m);
           String minute = val.toString();
           return minute;
    }
    public static String getFirst(int m)
    {
           Map<Integer,String> map = new HashMap<Integer,String>();
           map.put(1,"one minute");
           map.put(2,"two minutes");
           map.put(3,"three minutes");
           map.put(4,"four minutes");
           map.put(5,"five minutes");
           map.put(6,"six minutes");
           map.put(7,"seven minutes");
           map.put(8,"eight minutes");
           map.put(9,"nine minutes");
           map.put(10,"ten minutes");
           map.put(11,"eleven minutes");
           map.put(12,"twelve minutes");
           map.put(13,"thirteen minutes");
           map.put(14,"fourteen minutes");
           map.put(15,"quarter");
           map.put(16,"sixteen minutes");
           map.put(17,"seventeen minutes");
           map.put(18,"eighteen minutes");
           map.put(19,"nineteen minutes");
           map.put(20,"twenty minutes");
           map.put(21,"twenty one minutes");
           map.put(22,"twenty two minutes");
           map.put(23,"twenty three minutes");
           map.put(24,"twenty four minutes");
           map.put(25,"twenty five minutes");
           map.put(26,"twenty six minutes");
           map.put(27,"twenty seven minutes");
           map.put(28,"twenty eight minutes");
           map.put(29,"twenty nine minutes");
           map.put(30,"half");
           Object val = map.get(m);
           String minute = val.toString();
           return minute;
      }
    public static String getValueFromHashMap(int h)
    {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
        Object val = map.get(h);
        String hour = val.toString();
        return hour;
    }
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        if(m > 30)
        {
            h = h + 1;
        }
        int result = timeInWords(h, m);
        
    }
}