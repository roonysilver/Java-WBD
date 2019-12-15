package Array;

import java.util.Scanner;

public class gatherArray {
    public static int[] array1(int[] array1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size of array 1");
        int n = sc.nextInt();
        array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("input value for array at index " + i + " :");
            array1[i] = sc.nextInt();
        }
        return array1;
    }

    public static int[] array2(int[] array2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size of array 2");
        int n = sc.nextInt();
        array2 = new int[n];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("input value for array at index " + i + " :");
            array2[i] = sc.nextInt();
        }
        return array2;
    }

    public static int[] combine(int[] array1, int[] array2) {
        int aIndex = array1.length - 1;
        int bIndex = array2.length - 1;
        int cIndex = array1.length + array2.length - 1;
        int[] array3 = new int[cIndex + 1];


        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (array1[aIndex] > array2[bIndex]) {
                    array3[i] = array1[aIndex--];
                } else {
                    array3[i] = array2[bIndex--];
                }
            } else if (bIndex == -1) {
                array3[i] = array1[aIndex--];
            } else if (aIndex == -1) {
                array3[i] = array2[bIndex--];
            }
        }
        return array3;
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = null;
        int[] array2 = null;
        int[] array3 = null;


        array1 = array1(array1);


        array2= array2(array2);

        array3 = combine(array1, array2);

        show(array3);
    }
}