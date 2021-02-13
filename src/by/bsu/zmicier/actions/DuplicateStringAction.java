package by.bsu.zmicier.actions;

public class DuplicateStringAction implements StringAction {
    @Override
    public String doAction(String action) {
        return action + action;
    }
}
