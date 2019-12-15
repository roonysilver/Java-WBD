package ArrayIndexOutOfBoundsException;

public class MyClass {

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }

    public static void main(String[] args) {
        int[] arr ={5,10};
        System.out.println("a = " + arr[0]);
        System.out.println("b = " + arr[1]);
        swap(arr);
        System.out.println("a = " + arr[0]);
        System.out.println("b = " + arr[1]);
    }
}
