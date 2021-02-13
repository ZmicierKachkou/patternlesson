package by.bsu.zmicier.listeners;

import by.bsu.zmicier.Registry;
import by.bsu.zmicier.actions.CurlyBracketsActionDecorator;
import by.bsu.zmicier.actions.DoNothingAction;
import by.bsu.zmicier.actions.DuplicateStringAction;
import by.bsu.zmicier.actions.ReverseStringAction;
import by.bsu.zmicier.actions.SortCharsAction;
import by.bsu.zmicier.actions.SquareBracketsActionDecorator;
import by.bsu.zmicier.request.StringActionRequest;
import by.bsu.zmicier.sorting.MergeSortStrategy;
import by.bsu.zmicier.sorting.QuickSortStrategy;

public class InvokeRequestListener implements StringRequestListener {
    static {
        Registry.getInstance().register("duplicate",
                new DuplicateStringAction());
        Registry.getInstance().register("reverse",
                new ReverseStringAction());
        Registry.getInstance().register("brackets",
                new SquareBracketsActionDecorator(
                        new CurlyBracketsActionDecorator(
                                new DoNothingAction()
                        )
                ));
        Registry.getInstance().register("quicksort",
                new SortCharsAction(new QuickSortStrategy()));
        Registry.getInstance().register("mergesort",
                new SortCharsAction(new MergeSortStrategy()));
    }

    @Override
    public void onRequest(StringActionRequest request) {
        System.out.println(Registry.getInstance()
                .getAction(request.getRequestAction()).doAction(request.getRequestValue()));
    }
}
