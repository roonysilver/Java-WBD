import java.util.Scanner;

public class PassStudents {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter size");
            size = sc.nextInt();
            if(size > 30)
                System.out.print("You should input lower 30!");
        } while (size > 30);

        array = new int[size];
        for(int i = 0; i < array.length ; i++){
            System.out.println("Enter mark for student " + (i + 1) + " :");
            array[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print("List of mark: ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
            if(array[j] >=5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The students passing the Exam is: " + count );
    }
}
