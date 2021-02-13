package by.bsu.zmicier;

import by.bsu.zmicier.actions.DuplicateStringAction;
import by.bsu.zmicier.actions.ReverseStringAction;
import by.bsu.zmicier.request.StringActionRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Registry.getInstance().register("duplicate", new DuplicateStringAction());
        Registry.getInstance().register("reverse", new ReverseStringAction());

        Map<String, String> additionalParams = new HashMap<>();
        additionalParams.put("creationDate", new Date().toString());
        additionalParams.put("javaVersion", System.getProperty("java.version"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            StringActionRequest request = new StringActionRequest(
                    scanner.nextLine(),
                    scanner.nextLine(),
                    additionalParams
            );

            System.out.println(Registry.getInstance().getAction(request.getRequestAction())
                    .doAction(request.getRequestValue()));
        }
    }
}
