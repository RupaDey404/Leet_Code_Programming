package LeetCodewith_java;

import java.util.Arrays;
import java.util.Scanner;

public class medianTwoSortedArray {

        public double findMedianSortedArrays(int[] arr, int[] arr1) {

            int[] newArr = new int[arr.length + arr1.length];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            System.arraycopy(arr1, 0, newArr, arr.length, arr1.length);
            Arrays.sort(newArr);

            int len = newArr.length;

            if (len % 2 == 0) {
                return (newArr[len / 2] + newArr[len / 2 - 1]) / 2.0;
            }

            return newArr[len / 2];

        }

    public class MedianOfTwoSort {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            String[] arr = str.split("\\s+");
            int[] list1 = new int[arr.length];
            for (int i = 0; i < list1.length; i++) {
                list1[i] = Integer.parseInt(arr[i]);
            }
            String[] arr2 = sc.nextLine().split("\\s+");
            int[] list2 = new int[arr2.length];
            for (int i = 0; i < list2.length; i++) {
                list2[i] = Integer.parseInt(arr2[i]);
            }

            double ans = new medianTwoSortedArray().findMedianSortedArrays(list1, list2);
            System.out.println(ans);
        }


    }
}

