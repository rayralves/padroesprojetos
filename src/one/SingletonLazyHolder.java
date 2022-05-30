package one;

public class SingletonLazyHolder {
    private static class IntanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return IntanceHolder.instancia;

    }
}
