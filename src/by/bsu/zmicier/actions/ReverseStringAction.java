package by.bsu.zmicier.actions;

public class ReverseStringAction implements StringAction{
    @Override
    public String doAction(String action) {
        char[] input = action.toCharArray();
        char[] res = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            res[i] = input[input.length - i - 1];
        }
        return new String(res);
    }
}
