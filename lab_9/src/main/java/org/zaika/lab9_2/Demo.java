package org.zaika.lab9_2;

public class Demo {
    public static void main(String[] args)  {
        final Bank bank = new Bank();

        Thread thread = new Thread(new Thread1(bank));
        thread.start();
        Thread thread2 = new Thread(new Thread2(bank));
        thread2.start();
    }
}
