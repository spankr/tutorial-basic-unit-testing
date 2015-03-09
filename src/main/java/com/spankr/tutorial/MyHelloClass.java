package com.spankr.tutorial;

public class MyHelloClass {

    protected TimeService timeService;

    public String helloWorld(final String name) {
        return "Hello, " + name;
    }

    public String getMyTime() {
        return timeService.getTime();
    }

    public String thisThrowsAnException() {
        throw new UnsupportedOperationException("Not supported, duh");
    }
}
