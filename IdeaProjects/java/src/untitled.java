import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        String[] students = {"Christian","Micheal","Camila","Sienna","Tanya","Zachariah","Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name of student: ");
        String input_Name = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0; i < students.length; i++) {
            if(students[i].equals(input_Name)){
                System.out.println("Position of student in list "+ input_Name +  "is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if(!isExist)
            System.out.println("Not found " + input_Name + " in the list.");
    }
}
