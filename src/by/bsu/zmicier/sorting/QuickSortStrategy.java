package by.bsu.zmicier.sorting;

import java.util.Arrays;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public char[] sort(char[] array) {
        Arrays.sort(array);
        return array;
    }
}
