import com.sun.tools.javac.Main;

import java.util.Scanner;

public class isPrime {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("input number");
        int number = sc.nextInt();
        int count = 0;
        int i = 2;
        while (count < number){
            if(primeNumber.PrimeNumber(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}