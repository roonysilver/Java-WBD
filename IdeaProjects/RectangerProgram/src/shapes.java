import java.util.Scanner;

public class shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1. Draw the Triangle");
        System.out.println("2. Draw the Square");
        System.out.println("3. Draw the Rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        while (true){
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the Triangle");
                    for(int i = 1; i <= 5; i++){
                        for (int j = 1; j < i ; j++){
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    System.out.println("Draw the Square");
                    for(int i = 1; i <= 3; i++){
                        System.out.println(" ");
                        for (int j = 1; j <= 6 ; j++){
                            System.out.print("*" + " ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Draw the Rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}

