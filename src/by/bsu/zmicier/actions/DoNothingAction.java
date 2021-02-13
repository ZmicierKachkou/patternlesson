package by.bsu.zmicier.actions;

public class DoNothingAction implements StringAction {
    @Override
    public String doAction(String action) {
        return action;
    }
}

