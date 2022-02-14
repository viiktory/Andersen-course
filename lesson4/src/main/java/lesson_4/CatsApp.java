package lesson_4;

import lesson_4.animals.Cat;
import lesson_4.items.Plate;

public class CatsApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Bobik", 10),
                new Cat("Fobik", 20),
                new Cat("Gobik", 30),
                new Cat("Tobik", 40),
                new Cat("Dobik", 50)
        };

        Plate plate = new Plate(100);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("=======================");
        for (Cat cat : cats) {
            cat.checkSatiety();
        }
    }
}
