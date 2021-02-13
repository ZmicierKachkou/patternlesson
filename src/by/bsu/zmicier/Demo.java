package by.bsu.zmicier;

import by.bsu.zmicier.iterator.ConsoleIterable;
import by.bsu.zmicier.listeners.CompositeListener;
import by.bsu.zmicier.listeners.CoolRequestListenerAdapter;
import by.bsu.zmicier.listeners.InvokeRequestListener;
import by.bsu.zmicier.listeners.LogRequestListener;
import by.bsu.zmicier.listeners.SecurityListener;
import by.bsu.zmicier.listeners.StringRequestListener;
import by.bsu.zmicier.request.StringActionRequest;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<StringRequestListener> listeners = new ArrayList<>();
        listeners.add(new SecurityListener());
        listeners.add(new CoolRequestListenerAdapter());

        CompositeListener consoleBasedListener = new CompositeListener()
                .add(new LogRequestListener())
                .add(new InvokeRequestListener());
        listeners.add(consoleBasedListener);

        ConsoleIterable consoleReader = new ConsoleIterable();
        // for each !
        for (StringActionRequest request : consoleReader) {
            for (StringRequestListener listener : listeners) {
                listener.onRequest(request);
            }
        }
    }
}
