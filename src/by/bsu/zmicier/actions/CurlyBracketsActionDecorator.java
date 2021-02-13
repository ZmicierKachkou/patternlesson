package by.bsu.zmicier.actions;

public class CurlyBracketsActionDecorator implements StringAction {
    private final StringAction innerAction;

    public CurlyBracketsActionDecorator(StringAction action) {
        this.innerAction = action;
    }


    @Override
    public String doAction(String action) {
        return "{" + innerAction.doAction(action) + "}";
    }
}
