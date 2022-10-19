package org.zaika.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        int countRandomStats = 5;
        CareTaker careTaker = new CareTaker();
        Character character = new Character("Lutik", "bard", "human");
        Stats stats;
        Memento memento = new Memento();

        for(int i = 0; i < countRandomStats; i++){
            stats = Stats.generate();
            stats.print();
            memento.setState(stats);
            careTaker.add(memento);
        }

        //призначаємо 3 рандомізовані стати ГГ
        memento = careTaker.get(2);
        stats = memento.getStats();
        character.setAttributes(stats);
        character.characterInfo();
    }
}
