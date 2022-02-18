package lesson_5.fruit.box;

import lesson_5.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    List<T> list = new ArrayList<>();

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public double getWeight() {
        double sum = 0.0;
        for (T fruit : list) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(FruitBox<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void dropAllFruits(FruitBox<T> box) {
        for (int i = list.size() - 1; list.size() > 0; i--) {
            T fruit = list.remove(i);
            box.addFruit(fruit);
        }
    }
}
