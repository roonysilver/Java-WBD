import java.util.Scanner;

public class addIndex {
        public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input size array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("input number in array: \n");
        for(int i = 0; i < n ; i++){
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Input k: ");
        int k = sc.nextInt();
        sortASC(arr);
        System.out.printf("\n insert index at %d in array.", k);
        arr = insert(arr, k);
        System.out.print("\n Array after insert: ");
        show(arr);

    }
//sap xep mang theo thu tu tang dan!!
    public static void sortASC(int[] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    chen ki tu vao mang, sau khi chen, thu tu van tang dan k thay doi.
    public static int[] insert(int[] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int[] tempArr = new int[tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex--];
                }
            }
        }
        return tempArr;
    }

}
