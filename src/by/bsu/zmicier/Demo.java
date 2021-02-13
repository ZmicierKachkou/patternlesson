package by.bsu.zmicier;

import by.bsu.zmicier.actions.DoNothingAction;
import by.bsu.zmicier.actions.DuplicateStringAction;
import by.bsu.zmicier.actions.ReverseStringAction;
import by.bsu.zmicier.actions.StringAction;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String command = scanner.nextLine();

            StringAction action;
            if ("duplicate".equals(command)) {
                action = new DuplicateStringAction();
            } else if ("reverse".equals(command)) {
                action = new ReverseStringAction();
            } else {
                action = new DoNothingAction();
            }

            System.out.println(action.doAction(input));
        }
    }
}
