package ArrayIndexOutOfBoundsException;

public class MyClass2 {


    public static void swap(SoNguyen first, SoNguyen second) {
        int temp = first.value;
        first.value = second.value;
        second.value = temp;
    }

    public static void main(String[] args) {
        SoNguyen A = new SoNguyen(5);
        SoNguyen B = new SoNguyen(10);

        System.out.println("A = " + A.value);
        System.out.println("B = " + B.value);
        swap(A, B);
        System.out.println("A = " + A.value);
        System.out.println("B = " + B.value);
    }


}

class SoNguyen {
    public int value;

    public SoNguyen(int a) {
        this.value = a;

    }
}

