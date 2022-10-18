package baitap1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();
        Thread MAX_PRIORITY = new Thread(num1);
        Thread MIN_PRIORITY = new Thread(num2);
        MAX_PRIORITY.start();
        MIN_PRIORITY.start();
    }
}