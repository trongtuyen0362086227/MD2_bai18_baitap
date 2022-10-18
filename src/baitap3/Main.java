package baitap3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optim = new OptimizedPrimeFactorization();
        Thread t1 = new Thread(lazy);
        Thread t2 = new Thread(optim);
        t2.start();
        t1.start();

    }

}
