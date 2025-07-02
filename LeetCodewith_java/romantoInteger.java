package LeetCodewith_java;

import java.util.HashMap;
import java.util.Scanner;

public class romantoInteger {

    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

//        System.out.println(s);
        int countVal=0,i,j;
//        System.out.println(map.containsKey('I'));
        for(i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                countVal+=map.get(s.charAt(i));
//                System.out.println(map.get(s.charAt(i)));
            }

        }
//        System.out.println(countVal);
        return countVal;
    }
    public void main(String[] args) {


        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        int num = romanToInt(str);
        System.out.println(num);

    }
}
