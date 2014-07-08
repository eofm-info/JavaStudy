package info.efom.Gyakuhiki;

public class N068Sub extends N068Super {
    public N068Sub(String arg) {
        super(arg);
    }

    public void print() {
        System.out.println(superMethod()); // 呼べる
    }
}
