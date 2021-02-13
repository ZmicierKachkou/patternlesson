package by.bsu.zmicier.request;

import java.util.HashMap;
import java.util.Map;

public final class StringActionRequest {
    private final String requestValue;
    private final String requestAction;
    private final Map<String, String> additionalParams;

    public StringActionRequest(String requestValue, String requestAction,
            Map<String, String> additionalParams) {
        this.requestValue = requestValue;
        this.requestAction = requestAction;
        // Note! Storing a copy of hashMap so that we cannot affect
        // the instance by modifying additionalParams map
        this.additionalParams = new HashMap<>(additionalParams);
    }

    public String getRequestValue() {
        return requestValue;
    }

    public String getRequestAction() {
        return requestAction;
    }

    public Map<String, String> getAdditionalParams() {
        // Note! Returning a copy of map so that we cannot affect
        // the instance by modifying the value outside the class
        return new HashMap<>(additionalParams);
    }
}
