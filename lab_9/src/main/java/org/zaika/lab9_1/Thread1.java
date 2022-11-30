package org.zaika.lab9_1;

public class Thread1 implements Runnable {

    private final Bank bank;

    public Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.inc();
    }
}
