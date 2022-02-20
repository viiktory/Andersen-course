package lesson_6.exceptions;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException(String msg) {
        super(msg);
    }
}