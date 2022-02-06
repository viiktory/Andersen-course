package lesson_2;

//Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkTwoValues(5, 7));
        System.out.println(checkTwoValues(10, 10));
        System.out.println(checkTwoValues(-5, 7));
        System.out.println(checkTwoValues(5, -7));
        System.out.println(checkTwoValues(0, 10));
    }

    public static boolean checkTwoValues(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}