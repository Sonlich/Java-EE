package org.zaika.lab9_2;

public class Thread2 implements Runnable {

    private final Bank bank;

    public Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = 1; i <= 200000; i++) {
                bank.setAccount(bank.getAccount() - 1);
            }
            System.out.println("decries: " + bank.getAccount());
        }
    }
}
