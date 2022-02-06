package lesson_2;

//Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

public class Task2 {

    public static void main(String[] args) {
        isPositiveOrNegative(0);
        isPositiveOrNegative(1);
        isPositiveOrNegative(567);
        isPositiveOrNegative(-5);
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println(a + " Positive number");
        } else {
            System.out.println(a + " Negative number");
        }
    }
}
