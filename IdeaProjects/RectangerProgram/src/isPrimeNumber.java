import com.sun.tools.javac.Main;

import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
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
