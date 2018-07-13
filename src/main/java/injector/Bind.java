package com.jordivilagut.dependencyinjector.injector;

public class Bind<T, U extends T> {

    public final Class<T> requested;
    public final Class<U> destination;

    public Bind(Class<T> requested, Class<U> destination) {
        this.requested = requested;
        this.destination = destination;
    }
}
