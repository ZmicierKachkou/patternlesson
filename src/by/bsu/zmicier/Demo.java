package by.bsu.zmicier;

import by.bsu.zmicier.actions.DuplicateStringAction;
import by.bsu.zmicier.actions.ReverseStringAction;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Registry.getInstance().register("duplicate", new DuplicateStringAction());
        Registry.getInstance().register("reverse", new ReverseStringAction());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String command = scanner.nextLine();

            System.out.println(Registry.getInstance().getAction(command).doAction(input));
        }
    }
}
