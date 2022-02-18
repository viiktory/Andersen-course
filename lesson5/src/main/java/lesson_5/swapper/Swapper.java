package lesson_5.swapper;

public class Swapper<T> {
    public void swapTwoElementsInArray(T[] arr, Integer i1, Integer i2) {
        if(i1 >= arr.length || i2 >= arr.length) {
            System.out.println("Incompatible index");
            return;
        }
        T tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}
