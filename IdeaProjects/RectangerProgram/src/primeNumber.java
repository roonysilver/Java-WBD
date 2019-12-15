import java.util.Scanner;

public class primeNumber {

    public static boolean PrimeNumber(int number) {

        if(number < 2) {
            return false;
        }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return  false;
                    }
                }
        return true;
        }

    public static void main(String[] args) {
        System.out.println("prime number under 100");
        for(int i = 0 ; i < 100; i++){
            if (PrimeNumber(i)){
                System.out.print(i + " ");
                }
            }
        }
    }

