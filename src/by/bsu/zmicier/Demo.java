package by.bsu.zmicier;

import by.bsu.zmicier.actions.DuplicateStringAction;
import by.bsu.zmicier.actions.ReverseStringAction;
import by.bsu.zmicier.request.StringActionRequest;
import by.bsu.zmicier.request.StringActionRequestBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Registry.getInstance().register("duplicate", new DuplicateStringAction());
        Registry.getInstance().register("reverse", new ReverseStringAction());

        StringActionRequestBuilder builder = new StringActionRequestBuilder()
                .setAdditionalParam("creationDate", new Date().toString())
                .setAdditionalParam("javaVersion", System.getProperty("java.version"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            StringActionRequest request = builder
                    .setRequestValue(scanner.nextLine())
                    .setRequestAction(scanner.nextLine())
                    .build();

            System.out.println(Registry.getInstance().getAction(request.getRequestAction())
                    .doAction(request.getRequestValue()));
        }
    }
}
