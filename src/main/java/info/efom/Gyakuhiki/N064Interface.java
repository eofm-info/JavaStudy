package info.efom.Gyakuhiki;

public interface N064Interface {
    public static final String MESSAGE = "Hello ";

    public void hello(String name);

    default public String n065DefaultMethod() {
        return "n065Default method.";
    }
}
