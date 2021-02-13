package by.bsu.zmicier.iterator;

import by.bsu.zmicier.request.StringActionRequest;
import by.bsu.zmicier.request.StringActionRequestBuilder;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class ConsoleIterator implements Iterator<StringActionRequest> {
    private Scanner scanner = new Scanner(System.in);
    private StringActionRequestBuilder builder = new StringActionRequestBuilder()
            .setAdditionalParam("creationDate", new Date().toString())
            .setAdditionalParam("javaVersion", System.getProperty("java.version"));

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public StringActionRequest next() {
        return builder
                .setRequestValue(scanner.nextLine())
                .setRequestAction(scanner.nextLine())
                .build();
    }
}
