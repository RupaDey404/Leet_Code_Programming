package LeetCodewith_java;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class ContainerwithmostWater {

    public static int maxArea(int[] height)
    {
        int[] tempArr = new int[height.length];
        int i ,j, area =0, max=0,ht=0,ind1=0,ind2 = 0;
        int len = height.length;
        i=0;
        j = len-1;
        while(i<j){
            ht = Math.min(height[i],height[j]);
            area = (j-i)*ht;
            max = Math.max(max,area);
            if(height[i]<height[j]) i++;
            else j--;

        }

        return max;
    }

    public static void takeArray(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] numbers = str.split("\\s+");
        int[] height = new int[numbers.length];
        int i;
        for(i=0;i<numbers.length;i++){
            height[i] = Integer.parseInt(numbers[i]);
        }
        int area = maxArea(height);
        System.out.println(area);
        //for(var it: height) System.out.println(it+ " ");
    }
    public static void main(String[] args) {
        takeArray();
    }
}
// 1 8 6 2 5 4 8 3 7