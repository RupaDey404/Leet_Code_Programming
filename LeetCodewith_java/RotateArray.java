package LeetCodewith_java;

import java.util.ArrayList;
import java.util.Scanner;

    public class RotateArray {

        public static void rotateArr(int[] arr, int k) {
            int i, j, len;
            len = arr.length;
            k = k%len;
            ArrayList<Integer> num = new ArrayList<>();

            for (i = len - k; i < len; i++) {
                num.add(arr[i]);
            }
            for (i = 0; i < len - k; i++) {
                num.add(arr[i]);
            }

            System.out.print("[");
            for(i=0;i<num.size()-1;i++){
                System.out.print(num.get(i) + ",");}
            System.out.print(num.get(num.size()-1) + "]");
            System.out.println();

        }

        public static void takeArray() {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] list = str.split("\\s+");
            int[] arr = new int[list.length];
            for (int i = 0; i < list.length; i++) arr[i] = Integer.parseInt(list[i]);
            int target = sc.nextInt();
            rotateArr(arr, target);


//        for(var it: arr) System.out.println(it + " ");
        }

        public static void main(String[] args) {
            takeArray();
        }
    }


