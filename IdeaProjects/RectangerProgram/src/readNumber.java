import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String numbersIS;

        switch (number) {
            case 1:
                numbersIS ="one";
                break;
            case 2:
                numbersIS ="two";
                break;
            case 3:
                numbersIS = "three";
                break;
            case 4:
                numbersIS = "four";
                break;
            case 5:
                numbersIS ="five";
                break;
            case 6:
                numbersIS = "six";
                break;
            case 7:
                numbersIS = "seven";
                break;
            case 8:
                numbersIS ="eight";
                break;
            case 9:
                numbersIS ="nine";
                break;
            case 10:
                numbersIS ="ten";
                break;
            case 11:
                numbersIS ="eleven";
                break;
            case 12:
                numbersIS ="twelve";
                break;
            case 13:
                numbersIS ="thirteen";
                break;
            case 14:
                numbersIS ="fourteen";
                break;
            case 15:
                numbersIS ="fifteen";
                break;
            case 16:
                numbersIS ="sixteen";
                break;
            case 17:
                numbersIS ="seventeen";
                break;
            case 18:
                numbersIS ="eighteen";
                break;
            case 19:
                numbersIS ="nineteen";
                break;
            default:
                numbersIS ="";
                break;

        }
        if(number >= 20 && number < 30) {
            System.out.printf("twenty %s", numbersIS);
        }
        if(numbersIS != "") System.out.printf("number '%d' is %s",number,numbersIS);
        else System.out.print("Out of ability");
    }
}
