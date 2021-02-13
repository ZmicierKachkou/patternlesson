package by.bsu.zmicier.request;

import java.util.HashMap;
import java.util.Map;

public class StringActionRequestBuilder {
    private String requestValue;
    private String requestAction;
    private Map<String, String> additionalParams = new HashMap<>();

    public StringActionRequestBuilder setRequestValue(String requestValue) {
        this.requestValue = requestValue;
        // fluent interface
        return this;
    }

    public StringActionRequestBuilder setRequestAction(String requestAction) {
        this.requestAction = requestAction;
        // fluent interface
        return this;
    }

    public StringActionRequestBuilder setAdditionalParam(String key, String value) {
        this.additionalParams.put(key, value);
        return this;
    }

    public StringActionRequest build() {
        return new StringActionRequest(this.requestValue,
                this.requestAction,
                this.additionalParams);
    }
}