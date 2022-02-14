package lesson_4.animals;

public class Animal {
    protected String name;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public void run(int dist) {
        System.out.println("Animal " + name + " run " + dist + " m.");
    }

    public void swim(int dist) {
        System.out.println("Animal " + name + " swim " + dist + " m.");
    }

    public static void printCount() {
        System.out.println("Animals count: " + counter);
    }
}

