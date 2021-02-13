package by.bsu.zmicier.listeners;

import by.bsu.zmicier.Registry;
import by.bsu.zmicier.actions.DuplicateStringAction;
import by.bsu.zmicier.actions.ReverseStringAction;
import by.bsu.zmicier.request.StringActionRequest;

public class InvokeRequestListener implements StringRequestListener {
    static {
        Registry.getInstance().register("duplicate",
                new DuplicateStringAction());
        Registry.getInstance().register("reverse",
                new ReverseStringAction());
    }

    @Override
    public void onRequest(StringActionRequest request) {
        System.out.println(Registry.getInstance()
                .getAction(request.getRequestAction()).doAction(request.getRequestValue()));
    }
}
