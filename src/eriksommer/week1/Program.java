package eriksommer.week1;

import java.util.Arrays;
import java.util.Random;

public class Program {

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) {
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);

        for (int k = n - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);
            bytt(a, k, i);
        }
        return a;
    }

    public static int antallMaks(int[] a) {
        int antall = 0;
        int maksverdi = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                antall++;
                maksverdi = a[i];
            }
        }
        return antall;
    }

    public static int kostnader(int[] a) {
        int m = 0;
        for (int i = 1; i < a.length; i++) {
        } //Tom blokk
        return m;
    }

    public static int maks1(int[] a) {
        if (a.length < 1) throw new java.util.NoSuchElementException("Tabellen a er tom!");
        int m = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m]) {
                m = i;
            }
        }
        return m;
    }

    public static int maks2(int[] a) {
        int m = 0;
        int maksverdi = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                maksverdi = a[i];
                m = i;
            }
        }
        return m;
    }

    public static int maks3(int[] a) {
        if (a.length == 0) {
            return -1;
        }

        int sist = a.length - 1;
        int m = 0;
        int maksverdi = a[0];
        int temp = a[sist];
        a[sist] = 0x7fffffff; //Tallet: 2 147 483 647

        for (int i = 0; ; i++) {
            if (a[i] >= maksverdi) {
                if (i == sist) {
                    a[sist] = temp;
                    return temp >= maksverdi ? sist : m;
                } else {
                    maksverdi = a[i];
                    m = i;
                }
            }
        }
    }
}
