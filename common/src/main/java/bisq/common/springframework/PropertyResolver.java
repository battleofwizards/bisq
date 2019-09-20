package bisq.common.springframework;

public interface PropertyResolver {
    boolean containsProperty(String var1);

    String getProperty(String var1);

    String getProperty(String var1, String var2);

    <T> T getProperty(String var1, Class<T> var2);

    <T> T getProperty(String var1, Class<T> var2, T var3);

    /** @deprecated */
    @Deprecated
    <T> Class<T> getPropertyAsClass(String var1, Class<T> var2);

    String getRequiredProperty(String var1) throws IllegalStateException;

    <T> T getRequiredProperty(String var1, Class<T> var2) throws IllegalStateException;

    String resolvePlaceholders(String var1);

    String resolveRequiredPlaceholders(String var1) throws IllegalArgumentException;
}
