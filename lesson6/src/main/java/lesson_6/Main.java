package lesson_6;

import lesson_6.exceptions.MyArrayDataException;
import lesson_6.exceptions.MyArraySizeException;
import lesson_6.util.TestData;

public class Main {

    public static void main(String[] args) {
        for(String[][] arr : TestData.arrays) {
            try {
                int sum = getElementsSum(arr);
                System.out.println("Array is valid! Sum=" + sum);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getElementsSum(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Not valid array dimensions");
        }
        for(String[] inArr : arr) {
            if (inArr.length != 4) {
                throw new MyArraySizeException("Not valid array dimensions");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Bad data at: i=" + i + ", j=" + j);
                }
            }
        }
        return sum;
    }
}
