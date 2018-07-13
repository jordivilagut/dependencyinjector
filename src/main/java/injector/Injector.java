package com.jordivilagut.dependencyinjector.injector;


/**
 * Injector can return object instances.
 */

public interface Injector {

    /**
     * Returns an instance of the requested type.
     * Returns null in case the type is unrecognized.
     */
    <T> T getInstance(Class<T> type);
}
