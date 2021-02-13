package by.bsu.zmicier.actions;

public class SquareBracketsActionDecorator implements StringAction {
    private final StringAction innerAction;

    public SquareBracketsActionDecorator(StringAction action) {
        this.innerAction = action;
    }


    @Override
    public String doAction(String action) {
        return "[" + innerAction.doAction(action) + "]";
    }
}
