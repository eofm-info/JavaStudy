package info.efom.Gyakuhiki;

/**
 * Created by yamamotoj on 2014/07/08.
 */
public class N064Impl implements N064Interface {
    @Override
    public void hello(String name) {
        System.out.println(MESSAGE + name);
    }

}
