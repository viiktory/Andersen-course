package lesson_4.animals;

public class Dog extends Animal {
    private static final int RUN_MAX_DISTANCE = 500;
    private static final int SWIM_MAX_DISTANCE = 10;
    private static int counter = 0;

    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int dist) {
        if (dist < RUN_MAX_DISTANCE) {
            System.out.println("Dog " + name + " run " + dist + " m.");
        } else {
            System.out.println("Dog can't run more than " + RUN_MAX_DISTANCE + "m");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist < SWIM_MAX_DISTANCE) {
            System.out.println("Dog " + name + " swim " + dist + " m.");
        } else {
            System.out.println("Dog can't swim more than " + SWIM_MAX_DISTANCE + "m");
        }
    }

    public static void printCount() {
        System.out.println("Dogs count: " + counter);
    }
}

