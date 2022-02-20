package lesson_6.util;

import java.util.List;

public class TestData {
    /*
    1 - valid
    2 - not valid dimensions
    3 - not valid dimensions
    4 - not valid data
     */
    public static final List<String[][]> arrays = List.of(
            new String[][]{
                    {"1", "3", "5", "7"},
                    {"2", "4", "6", "8"},
                    {"1", "2", "5", "8"},
                    {"1", "3", "4", "7"}
            },
            new String[][]{
                    {"1", "3", "5", "7"},
                    {"2", "4", "6", "8"},
                    {"1", "2", "5", "8"}
            },
            new String[][]{
                    {"1", "3", "5", "7"},
                    {"2", "4", "6", "8"},
                    {"1", "2"},
                    {"1", "3", "4", "7"}
            },
            new String[][]{
                    {"1", "3", "5", "7"},
                    {"2", "4", "6", "8"},
                    {"1", "2", "5", "8"},
                    {"1", "a", "4", "7"}
            }
    );
}
