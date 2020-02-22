package test;


public class Zad6 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        do {
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < i; j++) {
                    int a = arr[j];
                    int b = arr[j + 1];
                    if (a > b) {
                        arr[j + 1] = a;
                        arr[j] = b;
                        for (int x = 0; x <= arr.length - 1; x++) {
                            System.out.print(arr[x] + " ");
                            i--;
                        }
                        System.out.println();
                    }
                }
            }
            n -= 1;
        } while (n > 0);
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 5, 4, 1, 2};
        for (int x = 0; x <= arr.length - 1; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            insertionSort(arr);
        }
        for (int x = 0; x <= arr.length - 1; x++) {
            System.out.print(arr[x] + " ");
        }
    }


}
