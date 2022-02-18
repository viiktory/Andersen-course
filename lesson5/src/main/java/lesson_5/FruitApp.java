package lesson_5;

import lesson_5.fruit.Apple;
import lesson_5.fruit.Orange;
import lesson_5.fruit.box.FruitBox;

public class FruitApp {
    public static void main(String[] args) {
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Orange> orangeFruitBox1 = new FruitBox<>();
        FruitBox<Orange> orangeFruitBox2 = new FruitBox<>();

        appleFruitBox.addFruit(new Apple());
        appleFruitBox.addFruit(new Apple());
        appleFruitBox.addFruit(new Apple());

        orangeFruitBox1.addFruit(new Orange());
        orangeFruitBox1.addFruit(new Orange());

        System.out.println("================ Исходный вес =================");
        System.out.println("Apple box weight: " + appleFruitBox.getWeight());
        System.out.println("Orange box1 weight: " + orangeFruitBox1.getWeight());
        System.out.println("Orange box2 weight: " + orangeFruitBox2.getWeight());


        System.out.println("================= Сравниваем ==================");
        System.out.println("Apple box == Orange box1:" + appleFruitBox.compare(orangeFruitBox1));
        System.out.println("Apple box == Orange box2:" + appleFruitBox.compare(orangeFruitBox2));

        System.out.println("=== Пересыпаем из Orange box1 в Orange box2 ===");
        orangeFruitBox1.dropAllFruits(orangeFruitBox2);

        System.out.println("================ Проверяем вес ================");
        System.out.println("Apple box weight: " + appleFruitBox.getWeight());
        System.out.println("Orange box1 weight: " + orangeFruitBox1.getWeight());
        System.out.println("Orange box2 weight: " + orangeFruitBox2.getWeight());

        System.out.println("========= Сравниваем после пересыпки ==========");
        System.out.println("Apple box == Orange box1:" + appleFruitBox.compare(orangeFruitBox1));
        System.out.println("Apple box == Orange box2:" + appleFruitBox.compare(orangeFruitBox2));
    }
}
