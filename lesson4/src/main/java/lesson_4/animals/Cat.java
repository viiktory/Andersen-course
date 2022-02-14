package lesson_4.animals;

import lesson_4.items.Plate;

public class Cat extends Animal {
    private static final int RUN_MAX_DISTANCE = 200;
    private static int counter = 0;
    private boolean satiety = false;
    private int appetite;

    public Cat(String name) {
        super(name);
        counter++;
    }

    public Cat(String name, int appetite) {
        this(name);
        this.appetite = appetite;
    }

    @Override
    public void run(int dist) {
        if (dist < RUN_MAX_DISTANCE) {
            System.out.println("Cat " + name + " run " + dist + " m.");
        } else {
            System.out.println("Cat can't run more than " + RUN_MAX_DISTANCE + "m");
        }
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat can't swim");
    }

    public void eat(Plate plate) {
        if(plate.eat(this.appetite)) {
            this.satiety = true;
            System.out.println(name + " eat from plate " + appetite + " foods.");
        } else {
            this.satiety = false;
        }
    }

    public void checkSatiety() {
        if(satiety) {
            System.out.println(name + " satiety.");
        } else {
            System.out.println(name + " angry.");
        }
    }

    public static void printCount() {
        System.out.println("Cats count: " + counter);
    }
}
