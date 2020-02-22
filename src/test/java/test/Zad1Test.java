package test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Zad1Test {

    @Test
    void isEmpty_false() {
        int i = 0;
        boolean wynik = Zad1.isEmpty(i);
        org.junit.jupiter.api.Assertions.assertFalse(wynik);
    }

//    @Test
//    void isEmpty_true() {
//        int[] tablica = {0, 1, 2, 3, 4, 5, 6, 7};
//        boolean wynik = Zad1.isEmpty(tablica);
//        org.junit.jupiter.api.Assertions.assertTrue(wynik);
//    }

    @Test
    void size() {
    }

    @Test
    void push_1() {

        Zad1 zad1 = new Zad1();
        int wynik = zad1.push(1);
        Assertions.assertThat(wynik).isEqualTo(1);
    }

    @Test
    void pop() {
    }
}