package LeetCodewith_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] list, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < list.length; i++){
           int key = target-list[i];
           if(map.containsKey(key)){
                return new int[]{map.get(key),i};
           }
           map.put(list[i],i);

        }
        return null;
    }

    public static  void takeArray(){
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList();

        String line = sc.nextLine();
        String[] arr1 = line.split("\\s+");
        int[] list = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
           list[i] = Integer.parseInt(arr1[i]);
        }

        int target = sc.nextInt();
        int[] index = twoSum(list,target);

        for(int i=0;i<index.length;i++){
            System.out.print(index[i]+" ");
        }
    }

    public static void main(String[] args) {
        takeArray();
    }
}
