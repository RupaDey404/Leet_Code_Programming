package LeetCodewith_java;

import java.util.Arrays;
import java.util.Scanner;

public class ContainerwithmostWater {

    public static int maxArea(int[] height)
    {
        int[] tempArr = new int[height.length];
        int i ,j, area =0, max,sc_max=0,ind1=0,ind2 = 0;
        for(i=0;i<height.length;i++){
            tempArr[i] = height[i];
        }
        Arrays.sort(tempArr);
        max = tempArr[tempArr.length-1];

        for(i=tempArr.length-2;i>=0;i--){
            if(tempArr[i]!=max){sc_max = tempArr[i]; break;}
        }
        //System.out.println("max : "+ max + " second max : "+sc_max);
       for(i=0;i<height.length;i++){
           if((height[i]==max && height[height.length-1]==sc_max)||
                   (height[i]==sc_max && height[height.length-1]==max) ||
                   (height[i]==max && height[height.length-1]==max)){ind1 = i; ind2 = height.length-1; break;}
       }


        return (ind2-ind1)*sc_max;
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
