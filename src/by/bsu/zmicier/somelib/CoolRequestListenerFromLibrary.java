package by.bsu.zmicier.somelib;

import by.bsu.zmicier.request.StringActionRequest;

// Let's imagine that we pick the class from some third party library
// We cannot fix it somehow
public class CoolRequestListenerFromLibrary {
    public int doRequest(StringActionRequest request) {
        int response = sendRequestStateToDB(request);
        return response;
    }

    private int sendRequestStateToDB(StringActionRequest request) {
        // let's imagine it really sends something to database :)
        System.out.println("Magic has happened! Request was logged to database.");
        return 200;
    }
}
