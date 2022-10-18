package baitap3;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int cnt = 0;
        while (cnt < 10) {
            for (int i = 0; i >= 0; i++) {
                if (!checknguyento(i)) {
                    System.out.println(i);
                    cnt++;
                }

            }
        }
    }

    public static boolean checknguyento(int n) {
        boolean check = true;
        if (n >= 2) {
            check = false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = true;
                    break;
                }
            }

        }
        return check;
    }
}
