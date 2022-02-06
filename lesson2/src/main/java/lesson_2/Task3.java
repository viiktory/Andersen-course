package lesson_2;

//Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// Замечание: ноль считаем положительным числом.

public class Task3 {

    public static void main(String[] args) {
        System.out.println(isNegative(-1));
        System.out.println(isNegative(-223));
        System.out.println(isNegative(0));
        System.out.println(isNegative(123));
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }

    }
}