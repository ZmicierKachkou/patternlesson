package by.bsu.zmicier;

import by.bsu.zmicier.actions.DoNothingAction;
import by.bsu.zmicier.actions.StringAction;
import java.util.HashMap;
import java.util.Map;

public class Registry {
    private static final Registry INSTANCE = new Registry(new DoNothingAction());

    private final Map<String, StringAction> actions = new HashMap<>();
    private final StringAction defaultAction;

    private Registry(StringAction action) {
        this.defaultAction = action;
    }

    public static Registry getInstance() {
        return INSTANCE;
    }

    public StringAction getAction(String key) {
        StringAction action = actions.get(key);
        if (action == null) {
            action = defaultAction;
        }
        return action;
    }

    public void register(String key, StringAction action) {
        actions.put(key, action);
    }
}
