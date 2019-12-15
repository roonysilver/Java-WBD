package Array;

import java.util.Scanner;

public class eraseArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array;
        int n,c,i;
        System.out.println("Input size of array: ");
        n = sc.nextInt();
        array = new int[n];
        for (i = 0; i < n; i++){
            int x = i +1;
            System.out.print("Input number at index " + x + ": ");
            array[i] = sc.nextInt();
        }

        int k;
        System.out.println("Input number you want to erase: ");
        k = sc.nextInt();
        for (c= i = 0; i < n ; i++){
            if(array[i] != k) {
                array[c] = array[i];
                c++;
            }
        }
        n = c;
        System.out.println("Array after erase"+ k +" at:");
        for (i = 0; i < n; i++){
            System.out.println(array[i]+ "\t");
        }
    }
}
