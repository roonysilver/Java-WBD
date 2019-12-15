package AbtractandInterface.Comparator;
import java.util.Arrays;
import java.util.Comparator;
import Inheritance.Circle.Circle;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "Indigo", true);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator CircleComparator = new CircleComparator();
        Arrays.sort(circles, CircleComparator);

        System.out.println("After sort:");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
