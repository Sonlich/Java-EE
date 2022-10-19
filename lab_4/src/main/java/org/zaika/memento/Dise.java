package org.zaika.memento;

import java.util.ArrayList;
import java.util.Collections;

public class Dise {
        static int quantity = 6;
        private static int roll() {
            return (int) Math.round(Math.random()*quantity+1);
        }

        public static int rollStats() {
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < quantity; i++) {
                list.add(roll());
            }

            list.sort(Collections.reverseOrder());

            for (int i = 0; i < quantity / 2; i++) {
                sum += list.get(i);
            }

            return sum;
        }
}
