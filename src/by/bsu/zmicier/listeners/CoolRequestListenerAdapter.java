package by.bsu.zmicier.listeners;

import by.bsu.zmicier.request.StringActionRequest;
import by.bsu.zmicier.somelib.CoolRequestListenerFromLibrary;

public class CoolRequestListenerAdapter implements StringRequestListener {
    private CoolRequestListenerFromLibrary listener =
            new CoolRequestListenerFromLibrary();

    @Override
    public void onRequest(StringActionRequest request) {
        listener.doRequest(request);
    }
}
