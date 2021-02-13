package by.bsu.zmicier.listeners;

import by.bsu.zmicier.request.StringActionRequest;

public class SecurityListener implements StringRequestListener {
    @Override
    public void onRequest(StringActionRequest request) {
        if("delete".equals(request.getRequestAction())) {
            throw new IllegalArgumentException("You cannot delete anything!!!!");
        }
    }
}
