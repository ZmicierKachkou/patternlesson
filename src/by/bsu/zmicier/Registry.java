package by.bsu.zmicier;

public class Registry {
    private static final Registry INSTANCE = new Registry();

    private Registry() { }

    public static Registry getInstance() {
        return INSTANCE;
    }
}
