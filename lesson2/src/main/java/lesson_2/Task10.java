package lesson_2;

//Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(initializeArray(5, 3)));
    }

    public static int[] initializeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
