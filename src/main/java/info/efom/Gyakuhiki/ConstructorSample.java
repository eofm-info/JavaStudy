package info.efom.Gyakuhiki;

/**
 * Created by jn on 2014/06/16.
 */
public class ConstructorSample {
    private String str;

    public ConstructorSample() {
        this("default");
    }

    public ConstructorSample(String str) {
        this.str = str;
    }
}
