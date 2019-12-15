package Array;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        String string;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a string");
        string = sc.nextLine();

        System.out.println("Input character");
        char c = sc.next().charAt(0);
        for(int i = 0; i < string.length(); i++){
            if(c == string.charAt(i)) count++;
        }
        System.out.println("Character "+ c+" showed up :" + count +" time");
    }
}
