package by.bsu.zmicier;

import by.bsu.zmicier.listeners.InvokeRequestListener;
import by.bsu.zmicier.listeners.LogRequestListener;
import by.bsu.zmicier.listeners.SecurityListener;
import by.bsu.zmicier.listeners.StringRequestListener;
import by.bsu.zmicier.request.StringActionRequest;
import by.bsu.zmicier.request.StringActionRequestBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        List<StringRequestListener> listeners = new ArrayList<>();
        listeners.add(new SecurityListener());
        listeners.add(new LogRequestListener());
        listeners.add(new InvokeRequestListener());

        StringActionRequestBuilder builder = new StringActionRequestBuilder()
                .setAdditionalParam("creationDate", new Date().toString())
                .setAdditionalParam("javaVersion", System.getProperty("java.version"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            StringActionRequest request = builder
                    .setRequestValue(scanner.nextLine())
                    .setRequestAction(scanner.nextLine())
                    .build();

            for (StringRequestListener listener : listeners) {
                listener.onRequest(request);
            }
        }
    }
}
