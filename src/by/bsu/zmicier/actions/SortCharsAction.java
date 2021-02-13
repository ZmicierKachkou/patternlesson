package by.bsu.zmicier.actions;

import by.bsu.zmicier.sorting.SortingStrategy;

public class SortCharsAction implements StringAction{

    private final SortingStrategy sortingStrategy;

    public SortCharsAction(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    @Override
    public String doAction(String action) {
        return new String(sortingStrategy.sort(action.toCharArray()));
    }
}
