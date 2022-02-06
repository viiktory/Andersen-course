package lesson_2;

// * Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный

public class Task5 {

    public static void main(String[] args) {
        System.out.println(yearDefinition(1992)); //високосный
        System.out.println(yearDefinition(2000)); //високосный
        System.out.println(yearDefinition(1900)); //не високосный
        System.out.println(yearDefinition(2022)); //не високосный
    }

    public static boolean yearDefinition(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
