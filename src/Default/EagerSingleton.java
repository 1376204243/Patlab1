package Default;

public class EagerSingleton {
    private EagerSingleton() {
    };
    private final static EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getinstance2() {
        return eagerSingleton;
    }
}
