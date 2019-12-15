import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;

        System.out.print("Enter invest amount: ");
        money = sc.nextDouble();

        System.out.print("Enter number of month: ");
        month = sc.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = sc.nextDouble();

        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
