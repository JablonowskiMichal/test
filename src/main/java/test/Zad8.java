package test;

public class Zad8 {

    public static void repleaceStos(int[] arr) {
        int n = arr.length - 1;
        int a = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] > 0) {
                a = a + arr[i];

                System.out.print(arr[i] + "; ");
            }
        }
        System.out.println();
        System.out.println("Najwieksza suma wybranych liczb z powyższego zbioru wynosi:" + a);
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, 3, 4, -2};
        for (int x = 0; x <= arr.length - 1; x++) {
            System.out.print(arr[x] + "; ");
        }
        System.out.println();
        repleaceStos(arr);

    }


}
