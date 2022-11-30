package org.zaika.lab9_1;

public class Bank {

    private int account;

    public synchronized void inc() {
        for (int i = 1; i <= 200000; i++) {
            account += 2;
        }
        System.out.println("increment: " + account);
    }

    public synchronized void dec() {
        for (int i = 1; i <= 200000; i++) {
            account -= 1;
        }
        System.out.println("decries: " + account);
    }
}
