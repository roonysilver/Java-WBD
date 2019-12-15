package Array;

import java.util.Scanner;

public class findMind {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n ;
        System.out.println("Input size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n] ;
        for (int i = 0; i < n; i++){
            int x = i + 1;
            System.out.println("Input number to array at "+ x + " :");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < n; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("The smallest number is: " + min);
    }
}
