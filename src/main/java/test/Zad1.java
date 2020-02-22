package test;

public class Zad1 {

    private int i;
    private int[] tablica;

    public Zad1() {
        i = 0;
        tablica = new int[100];
    }

    public int get(int index) {
        if (index >= i || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return tablica[index];
    }

    public static boolean isEmpty(int index) {
        if (index < 0) {
            return true;
            //throw new ArrayIndexOutOfBoundsException();
        }
        return false;
    }

    public int size() {
        return i;
    }

    public int push(int x) {
        if (i == tablica.length) {
            zwiększTablicę();
        }
        tablica[i++] = x;
        return x;
    }

//    public void push(int index, int x) {
//        if (i == tablica.length) {
//            zwiększTablicę();
//        }
//        System.arraycopy(tablica, index, tablica, index + 1, i - index);
//        tablica[index] = x;
//        i++;
//    }

    public void pop(int index) {
        if (index >= i || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index != i - 1) {
            System.arraycopy(tablica, index + 1, tablica, index, i - index - 1);
        }
        i--;
    }

    public void set(int index, int x) {
        if (index >= i || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        tablica[index] = x;
    }


    private void zwiększTablicę() {
        int nowaDługość;
        if (tablica.length == 0) {
            nowaDługość = 100;
        } else {
            nowaDługość = tablica.length * 2;
        }
        int[] nowaTablica = new int[nowaDługość];
        System.arraycopy(tablica, 0, nowaTablica, 0, i);
        tablica = nowaTablica;
    }
}
