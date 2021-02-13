package by.bsu.zmicier.listeners;

import by.bsu.zmicier.request.StringActionRequest;
import java.util.ArrayList;
import java.util.List;

public class CompositeListener implements StringRequestListener{
    private List<StringRequestListener> listeners = new ArrayList<>();

    public CompositeListener add(StringRequestListener listener) {
        listeners.add(listener);
        return this;
    }

    @Override
    public void onRequest(StringActionRequest request) {
        for (StringRequestListener listener : listeners) {
            listener.onRequest(request);
        }
    }
}