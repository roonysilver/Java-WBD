package ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.print("List of array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please input any number:  ");
        int x = sc.nextInt();
        try {
            System.out.println("Value of index at" + x + " is " +arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.print("Out of number");
        }
    }
}
