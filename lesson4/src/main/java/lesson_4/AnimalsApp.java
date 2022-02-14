package lesson_4;

import lesson_4.animals.Animal;
import lesson_4.animals.Cat;
import lesson_4.animals.Dog;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal.printCount();
        Dog.printCount();
        Cat.printCount();

        Animal bobik = new Dog("Bobik");
        Animal dobik = new Dog("Dobik");
        Animal fobik = new Cat("Fobik");

        Animal.printCount();
        Dog.printCount();
        Cat.printCount();

        System.out.println("=========================");

        bobik.run(100);
        bobik.run(800);
        dobik.swim(5);
        dobik.swim(100);
        fobik.swim(5);
    }
}
