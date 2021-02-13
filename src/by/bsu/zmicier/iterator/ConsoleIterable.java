package by.bsu.zmicier.iterator;

import by.bsu.zmicier.request.StringActionRequest;
import java.util.Iterator;

public class ConsoleIterable implements Iterable<StringActionRequest> {

    @Override
    public Iterator<StringActionRequest> iterator() {
        return new ConsoleIterator();
    }
}
