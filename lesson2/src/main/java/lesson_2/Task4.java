package lesson_2;

//Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class Task4 {

    public static void main(String[] args) {
        printWordNTimes("Hello", 5);
        printWordNTimes("it's", 0);
        printWordNTimes("me", -5);
    }

    public static void printWordNTimes(String text, int printCount) {
        for (int i = 0; i < printCount; i++) {
            System.out.println(text);
        }
    }
}