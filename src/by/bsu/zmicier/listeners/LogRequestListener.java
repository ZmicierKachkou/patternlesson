package by.bsu.zmicier.listeners;

import by.bsu.zmicier.request.StringActionRequest;
import java.util.Date;

public class LogRequestListener implements StringRequestListener {
    @Override
    public void onRequest(StringActionRequest request) {
        System.out.println(String.format("Request was registered on %s;\n"
                        + "value: %s, action: %s;\n"
                        + "additional params: %s",
                new Date(),
                request.getRequestValue(),
                request.getRequestAction(),
                request.getAdditionalParams()));
    }
}
