package test;

public class Zad4 {

    public static void repleaceStos(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i <= n - i; i++) {

            int a = arr[i];
            int b = arr[n - i];
            arr[i] = b;
            arr[n - i] = a;
            for (int x = 0; x <= arr.length - 1; x++) {
                System.out.print(arr[x] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 5, 4, 9, 6, 1, 0};
        for (int x = 0; x <= arr.length - 1; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        repleaceStos(arr);

    }


}
