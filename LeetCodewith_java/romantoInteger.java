package LeetCodewith_java;

import java.util.HashMap;
import java.util.Scanner;

public class romantoInteger {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int countVal=0;
        for(int i=s.length()-1;i>0;i--){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                countVal+= (map.get(s.charAt(i))-map.get(s.charAt(i-1)));
                    i--;
            }
            else if (map.get(s.charAt(i)).equals(map.get(s.charAt(i - 1)))){
                countVal+=(map.get(s.charAt(i)));
            }
            else {
                countVal+=map.get(s.charAt(i));
            }

        }
       // System.out.println(s.charAt(0));
        if(s.length()==1){countVal+=map.get(s.charAt(0));}
        else if(map.get(s.charAt(0)) >= map.get(s.charAt(1))){
       countVal+=map.get(s.charAt(0));}
//        System.out.println(countVal);
        return countVal;
    }
    public static void main(String[] args) {


        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        int num = romanToInt(str);
        System.out.println(num);

    }
}
