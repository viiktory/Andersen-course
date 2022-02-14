package lesson_4.items;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Plate foods: " + food);
    }

    public boolean eat(int food) {
        if(this.food < food) {
            System.out.println("Angry");
            return false;
        }
        this.food -= food;
        return true;
    }

    public void addFoods(int food) {
        this.food += food;
    }
}
