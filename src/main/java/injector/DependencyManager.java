package injector;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class DependencyManager implements Injector {

    private Map<Class, Class> bindings;

    public DependencyManager() {
        this.bindings = new HashMap<Class, Class>();
    }

    /**
     * Maps the requested type to the destination type, so when you call {@link #getInstance(Class)}
     * with the requested type, you will get an instance of the destination type.
     *
     * The destination type should have only one constructor.
     */
    public <T, U extends T> void bind(Class<T> requested, Class<U> destination) {
        bindings.put(requested, destination);
    }

    public <T> T getInstance(final Class<T> type) {

        Class destination = bindings.get(type);

        Constructor<?>[] constructors = destination.getConstructors();
        Constructor<?> constructor = constructors[0];

        try {

            // TODO: this constructor may have arguments
            // how to get objects of those classes to pass


            return (T) constructor.newInstance();

        } catch (Exception e) {

            throw new RuntimeException("Could not create instance", e);
        }

        //throw new IllegalArgumentException("Can't find instance for type " + type);
    }
}
