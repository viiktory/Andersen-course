package lesson_5;

import lesson_5.swapper.Swapper;

import java.util.Arrays;

public class SwapperApp {

    public static void main(String[] args) {

        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};

        new Swapper<Integer>().swapTwoElementsInArray(iArray, 1, 3);
        new Swapper<String>().swapTwoElementsInArray(sArray, 1, 3);


        System.out.println("Swap result in integer array: " + Arrays.toString(iArray));
        System.out.println("Swap result in string array: " + Arrays.toString(sArray));
    }

}